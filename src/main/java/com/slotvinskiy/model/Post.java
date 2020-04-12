package com.slotvinskiy.model;

public class Post {

    public Integer userId;
    public Integer id;
    public String title;
    public String body;


    @Override
    public String toString() {
        return "\n{" +
                "userId=" + userId +
                ",\n   id=" + id +
                ",\n   title='" + title + '\'' +
                ",\n   body='" + body + '\'' + "\n" +
                '}';
    }
}

