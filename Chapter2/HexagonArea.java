import java.util.*;
public class HexagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The length of the side: ");
        double length = input.nextDouble();
        double area = ((3*Math.sqrt(3))/2)*Math.pow(length,2);
        System.out.println("The area of the hexagon is "+area);
    }
    
}
