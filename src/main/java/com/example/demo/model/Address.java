package com.example.demo.model;

import lombok.Getter;

@Getter
public class Address {
    private String place;
    private String pincode;

    public Address(String place, String pincode) {
        this.place = place;
        this.pincode = pincode;
    }

    public Address(){
    }

    @Override
    public String toString() {
        return "Address{" +
                "place=" + place + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
