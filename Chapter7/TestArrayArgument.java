public class TestArrayArgument {
    public static void main(String[] args) {
        int x =1;
        int[] y = {1,2,3,4};
        test(x,y);
        System.out.println("Value of x after changing "+x);
        System.out.println("Value of y after changing "+y[0]);
        
    }
    public static void test(int number, int[] numbers) {
        number = 2;
        numbers[0] = 5;
        
    }
}
