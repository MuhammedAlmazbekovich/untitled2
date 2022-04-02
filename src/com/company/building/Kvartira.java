package com.company.building;


import com.company.Family;

import java.util.Arrays;

public class Kvartira extends Address {
    private Family[] families;

    public Kvartira(String address, Family[] families) {
        super(address, families);
    }

    @Override
    public Family[] getFamilies() {
        return families;
    }

    @Override
    public void setFamilies(Family[] families) {
        this.families = families;
    }

    @Override
    public String toString() {
        return "Kvartira{" +
                "families=" + Arrays.toString(families) +
                '}';
    }
}
