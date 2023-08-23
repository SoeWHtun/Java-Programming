public class LinearSearch {
    public static void main(String[] args) {
        int[] mylist = {1,2,3,4,5,7};
        int i = linearSearch(mylist, 4) ;
        System.out.println("The index of the key is "+i);
        
    }
    public static int linearSearch(int[] list, int key){
        for(int i=0;i<list.length;i++){
            if (key == list[i]){
             return i;
            }
        }
    return -1;
    }
    
}

