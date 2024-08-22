// Write a Java program that reads a list of integers from the user
// and throws an exception if any numbers are duplicates.
package ExceptionHandling;

import java.util.*;

public class DuplicateNumber {
    public static List<Integer> inputNumbers() {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integers (type 'E' to stop): ");
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("E")) {
                break;
            } else {
                numbers.add(Integer.valueOf(input));
            }
        }
        scanner.close();
        return numbers;
    }
    public static void checkNumDuplicate(List<Integer> numbers) throws DuplicateNumberException {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num: numbers) {
            if (uniqueNumbers.contains(num)) {
                throw new DuplicateNumberException("Duplicate number found: " + num);
            }
            uniqueNumbers.add(num);
        }
    }
    public static void main(String[] args) {
        try {
            List<Integer> numbers = inputNumbers();
            checkNumDuplicate(numbers);
            System.out.println("There is no duplicate number.");
        } catch (DuplicateNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}