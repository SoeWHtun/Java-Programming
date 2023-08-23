public class ArraySumElement {
    public static void main(String[] args) {
        double[] mylist = new double[5];
        for(int i = 0; i < mylist.length ; i++){
            mylist[i]= (Math.random()*10);
        }
        double total = 0;
        for( int i =0; i< mylist.length; i++){
            System.out.println(mylist[i]+" ");
            total= total + mylist[i];

        }
        System.out.printf("Sum of all element is %5.2f",total);
    }
    
}
