import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        float weight = input.nextFloat();
        System.out.print("Enter height in inches: ");
        float height = input.nextFloat();
        double pound= weight*0.45359237;
        double meter= height*0.0254;
        double bmi=pound/(Math.pow(meter, 2));
        System.out.println("BMI is "+bmi);

    }
    
}
