package Automobile.FourWheeler;

import Automobile.Vehicle;

public class Logan extends Vehicle {
    @Override
    public String modelName() {
        return "Logan";
    }

    @Override
    public String registrationNumber() {
        return "KA03MJ8765";
    }

    @Override
    public String ownerName() {
        return "Robert Brown";
    }

    public int speed() {
        return 80;
    }

    public void gps() {
        System.out.println("GPS is now ON");
    }
}
