import java.util.*;
public class BMIGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        float weight = input.nextFloat();
        System.out.print("Enter height in meter: ");
        float height = input.nextFloat();
        double bmi=weight/(Math.pow(height, 2));
        System.out.println("BMI is "+bmi);
        if (bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi < 25){
            System.out.println("Normal");
        }
        else if (bmi < 30){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
        

    }
}
