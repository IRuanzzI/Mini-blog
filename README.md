
```mermaid

erDiagram
    User {
        Long userId PK
        String name
        String email
        String password
        ENUM role
        String username
    }
    
    Post {
        Long postId PK
        String title
        String content
        Date date
        Long userId FK
    }
    
    Comment {
        Long commentId PK
        String content
        Date date
        Long postId FK
        Long userId FK
    }
    
    Tag {
        Long tagId PK
        String name NOT NULL
    }

    User ||--o{ Post : "1:n"
    User ||--o{ Comment : "1:n"
    Post ||--o{ Comment : "1:n"
    Post }o--o{ Tag : "n:n"
