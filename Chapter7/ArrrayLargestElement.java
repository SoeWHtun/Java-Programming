public class ArrrayLargestElement {
    public static void main(String[] args) {
        float[] mylist = new float[5];
        for(int i = 0;i<mylist.length;i++){
            mylist[i]=(float)Math.random()*10;

        }
        for(int i = 0;i<mylist.length;i++){
        System.out.println(mylist[i]+" ");
    }
    float max = mylist[0];
    int indexofMax = 0;
    for(int i = 1;i<mylist.length;i++ ){
      if(mylist[i]>max){
        max=mylist[i];
        indexofMax = i;
      }
    }
    System.out.println("Largest element in the array is "+max);
    System.out.println("Index of first max values "+indexofMax);
    
    }}
