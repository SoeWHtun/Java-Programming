import java.util.Scanner;
public class ComputeAreaWithInput {
    public static void main(String[] args) {
        //Create scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius= input.nextDouble();
        // Compute area
        double area = 3.14 * radius * radius;
        // Display result
        System.out.println("The area of the radius " + radius + " is " + area);

    }
    
}
