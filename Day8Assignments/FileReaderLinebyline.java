package Day8Assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderLinebyline {

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
