public class TestMax {
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }
    public static int min(int num1,int num2){
        int result;
        if (num1< num2){
            result=num1;
        }
        else{
            result=num2;
        }
        return result;
    }

    public static void main(String[] args) {
        int i =2;
        int j=5;
        int k = max(i,j);
        int m = min(i,j);
        System.out.println("The max of "+i+" and "+j+" is "+k);
        System.out.println("The min of "+i+" and "+j+" is "+m);

    }

}
