import java.util.*;
public class FiveEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number%5==0)
        System.out.println("Hifive");
        if (number%2==0)
        System.out.println("HiEven");

    }
    
}
