package com.slotvinskiy.model.user;

public class Geo {

    private String lat;
    private String lng;


    @Override
    public String toString() {
        return "{" +
                "lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }
}
