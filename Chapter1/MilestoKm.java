public class MilestoKm {
    public static void main(String[] args) {
        double miles = 100;
        final double KILOMETERS_PER_MILES = 1.609;
        double kilometer = KILOMETERS_PER_MILES * miles;
        System.out.println("There are " +kilometer+ " kilometers in " +miles+ " miles " );
    }
    
}
