public class PassTwoDimentionalArray {
    public static void main(String[] args) {
      int[][] array = getArray();
        System.out.println("Sum of all element is "+sum(array));
    }
    public static int[][] getArray(){
        int[][] array = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
                       return array;
    }
    public static int sum(int[][] x){
        int total=0;
        for(int row= 0; row<x.length;row++){
            for(int col=0;col<x[0].length;col++){
                total+= x[row][col];
            }
        }
        return total;
    }
    
}
