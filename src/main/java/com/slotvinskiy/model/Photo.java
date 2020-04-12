package com.slotvinskiy.model;

public class Photo {

    private Integer albumId;
    private Integer id;
    private String title;
    private String url;
    private String thumbnailUrl;

    @Override
    public String toString() {
        return "\n{" +
                "\n   albumId=" + albumId +
                ",\n   id=" + id +
                ",\n   title='" + title + '\'' +
                ",\n   url='" + url + '\'' +
                ",\n   thumbnailUrl='" + thumbnailUrl + '\'' + "\n" +
                '}';
    }
}





