import java.util.*;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] mylist = new double[10];
        double[] reverselist = new double[10];
        System.out.println("Enter " + mylist.length + " numbers");
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = input.nextDouble();
        }
        input.close();
        for (int j = 0, i = 9; j < reverselist.length; j++, i--) {

            reverselist[j] = mylist[i];
        }
        for (double var : reverselist) {
            System.out.print(var + "  ");
        }

    }
}
