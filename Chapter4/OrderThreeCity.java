import java.util.*;
public class OrderThreeCity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three city: ");
        String city1 = input.nextLine();
        String city2 = input.nextLine();
        String city3 = input.nextLine();
        char cityfront1 = city1.charAt(0);
        char cityfront2 = city2.charAt(0);
        char cityfront3 = city3.charAt(0);
        System.out.println("Three cities in alphabatical order are ");
        if(cityfront1<cityfront2 && cityfront1<cityfront3){
            System.out.println(city1);
         if(cityfront2<cityfront3){
            System.out.println(city2);
            System.out.println(city3);
        }
        else if(cityfront3<cityfront2){
            System.out.println(city3);
            System.out.println(city2);
        }
        }
        else if(cityfront2<cityfront1 && cityfront2<cityfront3){
            System.out.println(city2);
         if(cityfront1<cityfront3){
            System.out.println(city1);
            System.out.println(city3);
        }
        else if(cityfront3<cityfront1){
            System.out.println(city3);
            System.out.println(city1);
        }
        }
        else if(cityfront3<cityfront1 && cityfront3<cityfront2){
            System.out.println(city3);
         if(cityfront1<cityfront2){
            System.out.println(city1);
            System.out.println(city2);
        }
        else if(cityfront2<cityfront1){
            System.out.println(city2);
            System.out.println(city1);
        }
        }

    }
    
}
