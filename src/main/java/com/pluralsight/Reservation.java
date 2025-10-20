package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    public Reservation(String roomType, boolean isWeekend, int numberOfNights) {
        this.roomType = roomType;
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getPrice() {
        if (this.roomType.equalsIgnoreCase("King")) {
            return 139;
        } else if (this.roomType.equalsIgnoreCase("Double")) {
            return 124;
        }else {
            throw new IllegalArgumentException("Invalid room type: " + this.getRoomType());
        }
    }
    public double getReservationTotal() {
        double total = getPrice() * this.numberOfNights;
        if (isWeekend){
            total = total * 1.10;
        }
        return total;
    }
}
