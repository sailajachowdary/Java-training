package com.java.dailyExercisesday8;

import java.io.*;

public class Read {

    public static void main(String[] args) {
        // File path
        String filePath = "Student.dat";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            // Read objects from file
            java.util.Date currentDate = (java.util.Date) ois.readObject();
            Double doubleValue = (Double) ois.readObject();
            Long longValue = (Long) ois.readObject();

            // Display read objects
            System.out.println("Date Object: " + currentDate);
            System.out.println("Double Object: " + doubleValue);
            System.out.println("Long Object: " + longValue);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading objects from file: " + e.getMessage());
        }
    }
}


