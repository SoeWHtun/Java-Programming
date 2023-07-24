public class Incresement {
    public static void main(String[] args) {
        int x =1;
        System.out.println("Before calling method, x is "+x);
        increasement(x);
        System.out.println("After calling method , x is "+x);
        
    }
    public static void increasement(int n){
        n++;
        System.out.println("n inside method is "+n);
    }
}
