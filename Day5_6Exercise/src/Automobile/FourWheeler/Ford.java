package Automobile.FourWheeler;

import Automobile.Vehicle;

// Ford class extending the Vehicle abstract class
public class Ford extends Vehicle {
    // Implementing the abstract methods from Vehicle class
    @Override
    public String modelName() {
        return "Ford Mustang";
    }

    @Override
    public String registrationNumber() {
        return "DL04JK4567";
    }

    @Override
    public String ownerName() {
        return "Emily Clark";
    }

    // Method to return the current speed of the vehicle
    public int speed() {
        return 90;
    }

    // Method to control the temperature control device
    public void tempControl() {
        System.out.println("Temperature control is now ON");
    }
}
