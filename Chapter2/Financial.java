import java.util.*;
public class Financial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity_rate = input.nextDouble();
        double percent = (subtotal/100)*gratuity_rate;
        double total = subtotal+percent;
        System.out.println("The gratuity is $ "+percent+" and total is $ "+total );

    }
    
}
