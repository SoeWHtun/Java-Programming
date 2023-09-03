public class ShuffleRow {
    public static void main(String[] args) {
        int[][] m ={{1,2},
                    {3,4},
                    {5,6},
                    {7,8},
                    {9,10}};
     for (int row = 0; row < m.length; row++) {
         for (int col = 0; col < m[0].length; col++) {
            System.out.print(m[row][col]+" ");
      }
      System.out.println();
    }
    System.out.println("After shuffling: ");
    shuffle(m);
    for (int row = 0; row < m.length; row++) {
         for (int col = 0; col < m[0].length; col++) {
            System.out.print(m[row][col]+" ");
      }
      System.out.println();
    }
    
    
    }
    public static void shuffle(int[][] m){
        for (int row = 0; row < m.length; row++) {
            int i = (int)(Math.random()*m.length);
            int[] temp =  m[row];
            m[row]=m[i];
            m[i]=temp;  }
     
}

}

