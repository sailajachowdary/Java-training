package com.java.dailyExercisesday8;

import java.io.*;

public class Write {

    public static void main(String[] args) {
        // Objects to write to file
        java.util.Date currentDate = new java.util.Date();
        Double doubleValue = 177.456;
        Long longValue = 98765643310L;

        // File path
        String filePath = "Student.dat";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            // Write objects to file
            oos.writeObject(currentDate);
            oos.writeObject(doubleValue);
            oos.writeObject(longValue);

            System.out.println("Objects have been written to file: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing objects to file: " + e.getMessage());
        }
    }
}
