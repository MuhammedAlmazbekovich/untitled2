package com.company.building;

import com.company.Family;

public class Address {
    private String address;
    private Family[] families;


    public Address(String address , Family[] families) {
        this.address = address;
        this.families = families;
    }

    public Family[] getFamilies() {
        return families;
    }

    public void setFamilies(Family[] families) {
        this.families = families;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return address;
    }
}
