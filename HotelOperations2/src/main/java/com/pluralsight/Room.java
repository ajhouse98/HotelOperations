package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;

    private boolean occupied, dirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;
    }

    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }
    public double getPrice() {
        return this.price;
    }
    public boolean isOccupied() {
        return this.occupied;
    }
    public boolean isDirty() {
        return this.dirty;
    }
    public boolean isAvailable() {
        return (!this.occupied && !this.dirty);
    }


    public boolean checkIn() {
        if(this.isAvailable()) {
            this.occupied = true;
            this.dirty = true;
            return true;
        }
        return false;
    }

    public boolean checkOut() {
        this.occupied = false;
        return true;
    }

    public boolean cleanRoom() {
        this.dirty = false;
        return true;
    }
}