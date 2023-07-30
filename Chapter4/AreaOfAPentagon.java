import java.util.*;
public class AreaOfAPentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your length for pentagon: ");
        double length = input.nextDouble();
        double divisor = 4*(Math.tan((Math.PI/5)));
        double s = 2*length*(Math.sin((Math.PI/5)));
        double area =(5*(Math.pow(s,2)))/divisor;
        System.out.println("The area of the pentagon is "+Math.ceil(area*100)/100);

        
    }
}
