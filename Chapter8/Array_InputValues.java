import java.util.*;
public class Array_InputValues {
    public static void main(String[] args) {
        int[] [] matrix = new int [3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values in "+matrix.length+" rows "+matrix[0].length+" colums: ");
        //Ask user for array
        for(int row = 0;row<matrix.length;row++){
            for(int col = 0;col<matrix[0].length;col++){
                matrix[row][col] = input.nextInt();
            }
        }
        input.close();
        //Print 2D array
        for(int row = 0;row<matrix.length;row++){
            for(int col = 0;col<matrix[0].length;col++){
                System.out.print(matrix[row][col]+"  ");
            }System.out.println();
    }
}
}
