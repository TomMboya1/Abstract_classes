package org.example;

public class VehicleTester {
    public static void main(String[] args) {

        Car car = new Car(4, 4, 25000.0);
        car.showVehicleDetails();
        car.doVehicleSound();

        System.out.println("\n");


        Boat boat = new Boat(45.5, 1500);
        boat.showVehicleDetails();
        boat.doVehicleSound();


        System.out.println("\n" + boat.getBoatWeightAndSpeed());

    }
}
