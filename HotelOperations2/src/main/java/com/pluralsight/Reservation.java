package com.pluralsight;

public class Reservation {
    String roomType;
    double price;
    int numberOfNights;
    boolean isWeekend;


    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;

                if (roomType.equalsIgnoreCase("King")) {
                    this.price = 139.00;
        }
                else if (roomType.equalsIgnoreCase("Double")) {
                    this.price = 124.00;
                }
                else {
                    this.price = price; // set the prices as they are.
                }
                if (isWeekend) {
                    this.price *= 1.1; // increase the price by 10%
                }
        this.numberOfNights = numberOfNights;

        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        return price * numberOfNights;
    }

}
