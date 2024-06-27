package Test1;

import Automobile.TwoWheeler.Hero;
import Automobile.TwoWheeler.Honda;
import Automobile.FourWheeler.Logan;
import Automobile.FourWheeler.Ford;
import java.util.Scanner;

public class TestVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose a vehicle
        System.out.println("Choose a vehicle (1: Hero, 2: Honda, 3: Logan, 4: Ford): ");
        int choice = scanner.nextInt();

        // Check the user's choice and create the corresponding vehicle object
        if (choice == 1) {
            Hero hero = new Hero();
            System.out.println("Hero Model: " + hero.modelName());
            System.out.println("Hero Registration Number: " + hero.registrationNumber());
            System.out.println("Hero Owner Name: " + hero.ownerName());
            System.out.println("Hero Speed: " + hero.speed());
            hero.radio();
        } else if (choice == 2) {
            Honda honda = new Honda();
            System.out.println("Honda Model: " + honda.modelName());
            System.out.println("Honda Registration Number: " + honda.registrationNumber());
            System.out.println("Honda Owner Name: " + honda.ownerName());
            System.out.println("Honda Speed: " + honda.speed());
            honda.cdPlayer();
        } else if (choice == 3) {
            Logan logan = new Logan();
            
            System.out.println("Logan Model: " + logan.modelName());
            System.out.println("Logan Registration Number: " + logan.registrationNumber());
            System.out.println("Logan Owner Name: " + logan.ownerName());
            System.out.println("Logan Speed: " + logan.speed());
            logan.gps();
        } else if (choice == 4) {
            Ford ford = new Ford();
            System.out.println("Ford Model: " + ford.modelName());
            System.out.println("Ford Registration Number: " + ford.registrationNumber());
            System.out.println("Ford Owner Name: " + ford.ownerName());
            System.out.println("Ford Speed: " + ford.speed());
            ford.tempControl();
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
