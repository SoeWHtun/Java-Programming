public class TestMethodOverloading {
    public static void main(String[] args) {
        System.out.println("The maximum of two integers is "+max(5,6));
        System.out.println("The maximum of two doubles is "+max(5.1,6.7));
        System.out.println("The maximum of three doubles is "+max(1.3,5.6,8.3));
    }
    public static int max(int num1,int num2){
        if (num1>num2){
            return num1;
        }
        else{
            return num2;
        }
    } 
     public static double max(double num1,double num2){
        if (num1>num2){
            return num1;
        }
        else{
            return num2;
        }
    } 
     public static double max(double num1,double num2,double num3){
        return max(max(num1,num2),num3);
    } 
    
    
}
