package com.github.andrewcoder;

import java.util.Arrays;

public class Floor {
    private int floorNumber;
    private Flat[] flats;

    public Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    public Flat[] getFlats() {
        return flats;
    }
    @Override
    public String toString() {
        return "Этаж №" + floorNumber + " Кол-во квартир: " + flats.length;
    }
}
