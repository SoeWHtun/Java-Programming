import java.util.*;

public class LargestRowCol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] num = new double[4][4];
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[0].length; col++) {
                num[row][col] = input.nextDouble();
            }
        }
        input.close();
        int maxofRow = 0;
        int maxofCol = 0;
        int indexofMaxRow = 0;
        int indexOfmaxCol = 0;
        for (int row = 0; row < num.length; row++) {
            maxofCol += num[row][0];
        }
        for (int col = 0; col < num[0].length; col++) {
            maxofRow += num[0][col];
        }
        for (int row = 0; row < num.length; row++) {
            int totalRow = 0;
            for (int col = 0; col < num[0].length; col++) {
                totalRow += num[row][col];
                if (totalRow > maxofRow) {
                    indexofMaxRow = row;
                }

            }
        }
        for (int col = 0; col < num[0].length; col++) {
            int totalCol = 0;
            for (int row = 0; row < num.length; row++) {
                totalCol += num[row][col];
                if (totalCol > maxofCol) {
                    indexOfmaxCol = col;
                }

            }
        }
        System.out.println("The largest row index: " + indexofMaxRow);
        System.out.println("The largest column index: " + indexOfmaxCol);

    }

}
