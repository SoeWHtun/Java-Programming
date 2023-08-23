public class VarArgDemo {
    public static void main(String[] args) {
        printMax(1,2,3,4);
        printMax(new double[]{3,4,5,9});
    }
    public static void printMax(double... numbers){
        if(numbers.length==0){
            System.out.println("No argument passed. ");

        }
        double max = numbers[0];
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
 System.out.println("The max value is "+max);
    }
    
}
