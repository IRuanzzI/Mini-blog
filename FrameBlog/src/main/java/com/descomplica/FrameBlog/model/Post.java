package com.descomplica.FrameBlog.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long postId;

    private String title;

    private String content;

    private Date date;

    @ManyToOne
    private User userId;

    public Post(final long postId, final String title, final String content, final Date date,
                final User userId) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.date = date;
        this.userId = userId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}
