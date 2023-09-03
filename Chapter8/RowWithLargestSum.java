public class RowWithLargestSum {
    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int maxOfRow = 0;
        int indexOfmaxRow = 0;
            for (int col = 0; col < matrix.length; col++) {
                maxOfRow += matrix[0][col];
            }
            
            for (int row = 1; row < matrix.length; row++){
                    int total =0;
             for (int col = 0; col < matrix.length; col++){
                  total+= matrix[row][col];
             }if(total>maxOfRow){
                maxOfRow=total;
                indexOfmaxRow=row;
             }
            }
            System.out.println("Row "+indexOfmaxRow+" has the maximum sum of "+maxOfRow);
        

    }
}
