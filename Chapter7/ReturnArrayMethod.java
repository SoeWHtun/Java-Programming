public class ReturnArrayMethod {
    public static void main(String[] args) {
        int[] list1 = {1,2,3,4,5};
        int[] list2 = reverse(list1);
        System.out.println("Array2 is ");
       for(int value: list2){
        System.out.print(value+" ");
       }
    }
    public static int[] reverse(int [] list) {
        int[] result = new int[list.length];
        for(int i= 0 ,j=result.length-1 ; i<list.length ; i++ , j--){
              result[j]=list[i];
        }
        return result;
        
    }
    
}
