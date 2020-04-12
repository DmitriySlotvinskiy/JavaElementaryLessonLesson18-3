package com.slotvinskiy.model;

public class Comment {

    private Integer postId;
    private Integer id;
    private String name;
    private String email;
    private String body;

    @Override
    public String toString() {
        return "\n{" +
                "\n   postId=" + postId +
                ",\n   id=" + id +
                ",\n    name='" + name + '\'' +
                ",\n    email='" + email + '\'' +
                ",\n    body='" + body + '\'' + "\n" +
                '}';
    }
}

