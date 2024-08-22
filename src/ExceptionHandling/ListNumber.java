// Write a Java program that reads a list of numbers from a file
// and throws an exception if any of the numbers are positive.
package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListNumber {
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        // Read and process the contents of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            try {
                int number = Integer.parseInt(line.trim());
                if (number > 0) {
                    throw new IllegalArgumentException("Positive number: " + number);
                }
                System.out.println(line);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + e.getMessage());
            }
        }
        scanner.close();
    }
    public static void main(String[] args) {
        try {
            String filePath = "C:\\Users\\minh.nguyen\\Downloads\\Java_OOP\\src\\ExceptionHandling\\test1.txt";
            readFile(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
