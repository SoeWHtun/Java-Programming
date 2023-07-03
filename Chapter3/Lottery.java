import java.util.*;
public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lotf = (int)(System.currentTimeMillis()%10);
        int lots = (int)(System.currentTimeMillis()%10);
        
        System.out.println("Enter your lottery number");
        int winn = input.nextInt();
        int first = winn/10;
        int second = winn%10;
        
        if (lotf==first && lots==second){
            System.out.println("You won 10000");

        }
        else if (first== lots || second == lotf ){
            System.out.println("You won 3000");
        }
        else if (first== lotf || first == lots){
            System.out.println("You won 1000");
        }
        else if (second == lotf || second == lotf){
            System.out.println("You won 1000");
        }
        else{
            System.out.println("You didnt win anything");
        }
        System.out.println("The lottery is "+lotf+""+lots);
    }
}
