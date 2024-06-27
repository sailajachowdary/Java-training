package com.java.dailyExercisesday8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

    public static void main(String[] args) {
        String filePath = "line.txt"; // Replace with your file path

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}