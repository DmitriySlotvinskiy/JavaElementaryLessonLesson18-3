package com.slotvinskiy.model;

public class ToDo {

    private Integer userId;
    private Integer id;
    private String title;
    private Boolean completed;

    @Override
    public String toString() {
        return "\n{" +
                "\n   userId=" + userId +
                ",\n   id=" + id +
                ",\n   title='" + title + '\'' +
                ",\n   completed=" + completed + "\n" +
                '}';
    }
}
