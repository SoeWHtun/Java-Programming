import java.util.*;
public class SimplifyCodeWithArray {
    public static void main(String[] args) {
        String[] month ={"January","February","March","April",
                          "May,","June","July","August","September",
                           "October","November","December"};
    System.out.println("Enter a number between 1 to 12");
    Scanner input = new Scanner(System.in);
    int monthNumber = input.nextInt();
    System.out.println("The month is "+month[monthNumber-1]);
    input.close();
    }
    
}
