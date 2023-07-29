import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number :");
        int first = input.nextInt();
        int second = input.nextInt();
        System.out.println("The greatest common divisor of "+first+" and "+second+" is "+gcd(first, second));

    }

    public static int gcd(int num1, int num2) {
        if (num2 > num1) {
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }
        int a = 0;
        for (int i = 1; i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                a = i;
            }

        }
        int gcdf = a;
        return gcdf;
    }

}
