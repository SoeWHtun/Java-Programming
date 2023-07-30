import java.util.*;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your letter: ");
        String alpha = input.nextLine();
        char letter = alpha.charAt(0);
        boolean isalphabet = Character.isLetter(letter);
        if (isalphabet) {
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                System.out.println(letter + " is vowel");
            } else if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is vowel");
            } else {
                System.out.println(letter + " is consonant");
            }

        } else {
            System.out.println(letter + " is an invalid input");
        }

    }
}
