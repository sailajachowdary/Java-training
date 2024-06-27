package Automobile.TwoWheeler;

// Import the Vehicle class from the Automobile package
import Automobile.Vehicle;

public class Hero extends Vehicle {
    // Implement the modelName method to return the model name
    @Override
    public String modelName() {
        return "Hero Splendor";
    }

    @Override
    public String registrationNumber() {
        return "AP12RT536";
    }

    @Override
    public String ownerName() {
        return "Harsha";
    }

    // This method return speed of Vehicle
    public int speed() {
        return 60;
    }

    // Method to provide functionality for controlling the radio
    public void radio() {
        System.out.println("Radio is now ON");
    }
}
