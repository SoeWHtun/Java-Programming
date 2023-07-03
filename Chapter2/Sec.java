import java.util.*;
public class Sec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the second in integer: ");
        int sec = input.nextInt();
        int minute = sec/60;
        int remainingSeconds = sec % 60;
        System.out.println(sec+ " in seconds is " +minute+ "  minutes and " +remainingSeconds+ " seconds");

    }
    
}
