package com.company.building;


import com.company.Family;

import java.util.Arrays;

public class Obshaga extends Address {
    private Family[] families;

    public Obshaga(String address, Family[] families) {
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
        return "Obshaga{" +
                "families=" + Arrays.toString(families) +
                '}';
    }
}

