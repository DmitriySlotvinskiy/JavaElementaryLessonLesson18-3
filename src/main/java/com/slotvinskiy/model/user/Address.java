package com.slotvinskiy.model.user;

public class Address {

    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    @Override
    public String toString() {
        return "{" +
                "street='" + street + '\'' +
                ", suite='" + suite + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", geo=" + geo +
                '}';
    }
}