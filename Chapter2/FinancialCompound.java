import java.util.*;
public class FinancialCompound {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  
    System.out.print("Enter the monthly saving amount: ");
    float saving = input.nextFloat();
    double percent = (saving*0.05)/12;
    double firstmonth = saving+percent;
    double secmonth = (saving+firstmonth)+percent;
    double thirdmonth = (saving+secmonth)+percent;
    double fourthmonth = (saving+thirdmonth)+percent;
    double fifthmonth = (saving+fourthmonth)+percent;
    double sixmonth = (saving+fifthmonth)+percent;
    System.out.println("After the sixth month, the account value is $ "+sixmonth);


 }    
}
