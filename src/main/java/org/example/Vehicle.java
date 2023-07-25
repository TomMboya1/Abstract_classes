package org.example;

public abstract class Vehicle {
    protected String type;
    protected int numberOfWheels;

    public Vehicle(String type, int numberOfWheels) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    public void showVehicleDetails() {
        System.out.println("Type: " + type + "\nNumber of Wheels: " + numberOfWheels);
    }

    public abstract void doVehicleSound();
}
