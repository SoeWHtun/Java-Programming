public class TestCircle2 {
    public static void main(String[] args) {
        System.out.println("Before creating objeccts");
        System.out.println("The number of objects are "+Circle2.numberofObjects);
        Circle2 c1  = new Circle2();
        Circle2 c2  = new Circle2();
        System.out.println("\nAfter creating a circle object "+c1.numberofObjects+" "+c2.numberofObjects);
        
    }
    
}
