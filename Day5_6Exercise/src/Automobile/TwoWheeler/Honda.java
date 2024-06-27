package Automobile.TwoWheeler;

// Import the Vehicle class from the Automobile package
import Automobile.Vehicle;

public class Honda extends Vehicle {
    // Implement the modelName method to return the model name
    @Override
    public String modelName() {
        return "Honda Activa";
    }

    @Override
    public String registrationNumber() {
        return "YU2367I93";
    }

    @Override
    public String ownerName() {
        return "Ashok";
    }

    public int speed() {
        return 70;
    }

    //it provide functionality for controlling the CD player
    public void cdPlayer() {
        System.out.println("CD Player is now ON");
    }
}
