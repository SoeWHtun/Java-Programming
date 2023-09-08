public class TestSimpleCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The area of circle1 of radius "+circle1.radius+" is "+circle1.geetArea());
        Circle circle2 = new Circle(25);
         System.out.println("The area of circle2 of radius "+circle2.radius+" is "+circle2.geetArea());


    }
    
}
