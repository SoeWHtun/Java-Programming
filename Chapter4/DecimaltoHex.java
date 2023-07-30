import java.util.*;
public class DecimaltoHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your decimal number (0 to 15): ");
        int decimal = input.nextInt();
        if(decimal<=15){
        switch(decimal){
            case 0 :System.out.println("The hexadecimal is 0");break;
            case 1 :System.out.println("The hexadecimal is 1");break;
            case 2 :System.out.println("The hexadecimal is 2");break;
            case 3 :System.out.println("The hexadecimal is 3");break;
            case 4 :System.out.println("The hexadecimal is 4");break;
            case 5 :System.out.println("The hexadecimal is 5");break;
            case 6 :System.out.println("The hexadecimal is 6");break;
            case 7 :System.out.println("The hexadecimal is 7");break;
            case 8 :System.out.println("The hexadecimal is 8");break;
            case 9 :System.out.println("The hexadecimal is 9");break;
            case 10 :System.out.println("The hexadecimal is A");break;
            case 11 :System.out.println("The hexadecimal is B");break;
            case 12:System.out.println("The hexadecimal is C");break;
            case 13:System.out.println("The hexadecimal is D");break;
            case 14:System.out.println("The hexadecimal is E");break;
            case 15:System.out.println("The hexadecimal is F");break;
        }}
        else{
            System.out.println(decimal+" is invalid input.");
        }
        
    }
    
}
