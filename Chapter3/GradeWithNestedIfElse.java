import java.util.*;
public class GradeWithNestedIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your mark ");
        double mark = input.nextDouble();
        if (mark>=90){
            System.out.println("Grade is A");
        }
        else if(mark>=80){
            System.out.println("Grade is B");
        }
        else if(mark>=70){
            System.out.println("Grade is C");
        }
        else if(mark>=60){
            System.out.println("Grade is D");
        }
        else {
            System.out.println("Grade is F");
        }

    }
}
