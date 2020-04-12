package com.slotvinskiy.model;

public class Album {

    private Integer userId;
    private Integer id;
    private String title;

    @Override
    public String toString() {
        return "\n{\n" +
                "   userId=" + userId +
                ",\n   id=" + id +
                ",\n   title='" + title + '\'' + "\n" +
                '}';
    }
}
