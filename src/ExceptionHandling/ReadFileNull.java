// Write a Java program that reads a file and throws an exception if the file is empty.
package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.EmptyStackException;
import java.util.Scanner;

public class ReadFileNull {
    public static void checkFileEmpty(String fileName) throws FileNotFoundException, EmptyFileException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        if (!scanner.hasNextLine()) {
            scanner.close();
            throw new EmptyFileException("File is empty.");
        }
        scanner.close();
    }
    public static void main(String[] args) {
        try {
            String filePath = "C:\\Users\\minh.nguyen\\Downloads\\Java_OOP\\src\\ExceptionHandling\\test1.txt";
            checkFileEmpty(filePath);
            System.out.println("File is not empty.");
        } catch (EmptyFileException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Error: file is not found." + e.getMessage());
        }
    }
}
class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}