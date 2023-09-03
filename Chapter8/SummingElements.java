public class SummingElements {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
      int total = 0;
      for(int row =0;row<matrix.length;row++){
        for(int col=0;col<matrix.length;col++){
            total += matrix[row][col];
        }
      }System.out.println("The sum is "+total);
    }

}
