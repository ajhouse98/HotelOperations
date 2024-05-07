package com.pluralsight;

public class Room {
    int numberOfBeds;
    double price;
    boolean occupied;
    boolean dirty;
    boolean available;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty, boolean available) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void checkIn(boolean occupied, boolean dirty) {
        this.occupied = occupied;
        if (occupied)
            System.out.println("This is room is occupied and marked as dirty");
        this.dirty = dirty;
    }

    public void checkOut(boolean available, boolean dirty) {

    }

    public void cleanRoom() {

    }

}
