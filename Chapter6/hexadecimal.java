import java.util.*;
public class hexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your hexadecimal number in Capital letter: ");
        String a = input.next();
        System.out.println("The decimal number of "+a+" is "+hexTodecimal(a));
        
        
    }
    public static  int hexTodecimal(String x){
        int length = x.length();
        int digit = 0;
        int decimal = 0;
        for(int i=0;i<=length-1;i++){
            char c = x.charAt(i);
            if(c >= '0' && c <= '9'){
                digit=c - '0';
            }
            else if(c >= 'A' && c <= 'F'){
                digit=10+c - 'A';
            }
            decimal+=digit*Math.pow(16,length-1-i);


        }
        return decimal;
    }
    
    
}

