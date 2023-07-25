package org.example;

public class Boat extends Vehicle{
    private double maxKnotsSpeed;
    private int boatKilosWeight;

    public Boat(double maxSpeed, int weight) {
        super("Boat", 0);
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Boat sound: Honk Honk!");
    }

    public String getBoatWeightAndSpeed() {
        return "Boat Weight: " + boatKilosWeight + " kg\nMaximum Knots Speed: " + maxKnotsSpeed + " knots";
    }
}
