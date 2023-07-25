package org.example;

public class Car extends Vehicle {
    private int numberOfDoors;
    private double carPrice;

    public Car(int wheels, int doors, double price) {
        super("Car", wheels);
        this.numberOfDoors = doors;
        this.carPrice = price;
    }


    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Car sound: Vroom Vroom!");
    }

}
