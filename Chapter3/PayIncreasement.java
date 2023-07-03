import java.util.*;
public class PayIncreasement {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your amount:");
        double pay = input.nextDouble();
        System.out.print("Enter your score of evalutation: ");
        double score = input.nextDouble();
        if (score<90){
        double onepay_increasement = pay + (pay * 0.01);
        System.out.println("Your new payment after 1% increasement is "+onepay_increasement);}
        else{
            double threepay_increasement = pay + (pay * 0.03);
            System.out.println("Your new payment after 3% increasement is "+threepay_increasement);
         }
        
        

    }
}
