// Write a Java program to create a method that takes a string as input
// and throws an exception if the string does not contain vowels.
package ExceptionHandling;
public class VowelCheck {
    public static void main(String[] args) {
        try {
            String text = "Minh";
            System.out.println("Original string: " + text);
            checkVowels(text);
            System.out.println("String contain vowels.");
        } catch (NoVowelsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void checkVowels(String text) throws NoVowelsException {
        boolean containVowels = false;
        String vowels = "ueoaiUEOAI";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (vowels.contains(String.valueOf(ch))) {
                containVowels = true;
                break;
            }
        }
        if (!containVowels) {
            throw new NoVowelsException("Strings does not contain vowel.");
        }
    }
}
class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}