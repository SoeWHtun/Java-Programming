import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String user = input.nextLine();
        if (isPalindrome(user)) {
            System.out.println("The input is palindrome");

        } else {
            System.out.println("The input is not palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                return true;
            }
            left++;
            right--;
        }
        return false;

    }

}
