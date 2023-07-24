import java.util.*;
public class StringMethods {
    public static void main(String[] args) {
        String message = "Welcome to Java";
        System.out.println("The length of "+ message + " is "+ message.length());
        System.out.println("The first character of the message is "+message.charAt(0));
        System.out.println("The message is in Uppercase: "+message.toUpperCase());
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println(name.toUpperCase());
        String emailDB = "soewana35@gmail.com";
        String emailIN = "Soewana35@gmail.com";
        System.out.println(emailDB.compareTo(emailIN));
        message = message.substring(0,11)+"HTML";
        System.out.println(message);
        System.out.println("Welcome to java".indexOf("j"));
        String Fullname = "Soe Wana Htun";
        int index = Fullname.indexOf(" ");
        String Firstname = Fullname.substring(0,index);
        System.out.println(Firstname);
        String Lastname = Fullname.substring(index+1);
        System.out.println(Lastname);

    }
    
}
