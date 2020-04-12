package com.slotvinskiy.model.user;

public class User {

    private Integer id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    @Override
    public String toString() {
        return "\n{" +
                "\n    id=" + id +
                ",\n    name='" + name + '\'' +
                ",\n    username='" + username + '\'' +
                ",\n    email='" + email + '\'' +
                ",\n    address=" + address +
                ",\n    phone='" + phone + '\'' +
                ",\n    website='" + website + '\'' +
                ",\n    company=" + company + "\n" +
                '}';
    }
}