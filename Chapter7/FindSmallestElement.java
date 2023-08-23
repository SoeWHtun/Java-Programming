import java.util.*;

public class FindSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] mylist = new double[10];
        System.out.println("Enter " + mylist.length + " numbers");
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = input.nextDouble();
        }
        input.close();
        double min = mylist[0];
        for (int i = 0; i < mylist.length; i++) {
            if (mylist[i] < min) {
                min = mylist[i];
            }
        }
        System.out.println("The smallest number is " + min);

    }

}
