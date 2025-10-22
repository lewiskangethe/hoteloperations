package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int numberOfBeds, boolean isAvailable, boolean isDirty, boolean isOccupied, double price) {
        this.numberOfBeds = numberOfBeds;
        this.isAvailable = isAvailable;
        this.isDirty = isDirty;
        this.isOccupied = isOccupied;
        this.price = price;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }

    public void checkIn() {
        if (isAvailable) {
            isOccupied = true;
            isDirty = true;
            isAvailable = false;
        } else {
            System.out.println("Room is unavailable.");
        }
    }

    public void checkout() {
        if (isOccupied) {
            isOccupied = false;
            isDirty = true;
            isAvailable = false;
        } else {
            System.out.println("Room is available.");
        }
        cleanRoom();
    }

    private void cleanRoom() {
        isDirty = false;
    }
}