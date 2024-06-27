package Day3.Assignment;

import java.util.Scanner;
public class VehicleManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Creating 2 vehicle objects
        Vehicle[] vehicles = new Vehicle[2];

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Enter details for this Vehicle " + (i + 1) + ":");
            System.out.print("Regno: ");
            String regno = scanner.nextLine();
            System.out.print("Brand: ");
            String brand = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Mileage: ");
            double mileage = scanner.nextDouble();
            scanner.nextLine(); // consume the newline

            vehicles[i] = new Vehicle(regno, brand, price, mileage);
        }

        // Displaying vehicle with the lowest price
        Vehicle lowestPriceVehicle = vehicles[0];
        Vehicle bestMileageVehicle = vehicles[0];

        for (int i = 1; i < vehicles.length; i++) {
            if (vehicles[i].getPrice() < lowestPriceVehicle.getPrice()) {
                lowestPriceVehicle = vehicles[i];
            }
            if (vehicles[i].getMileage() > bestMileageVehicle.getMileage()) {
                bestMileageVehicle = vehicles[i];
            }
        }

        System.out.println("Vehicle with the lowest price:");
        lowestPriceVehicle.display();

        System.out.println("Vehicle with the best mileage:");
        bestMileageVehicle.display();

        scanner.close();


	}

}

