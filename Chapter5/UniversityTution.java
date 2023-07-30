public class UniversityTution {
    public static void main(String[] args) {
        double initialFee = 10000;
        double targeetFee = initialFee*2;
        double increaseFee = initialFee;
        int year = 0 ;
        while (increaseFee<targeetFee){
            increaseFee+=increaseFee*0.07;
            year++;
        }
        System.out.println("The tution will be $ "+increaseFee+" in "+year+" years.");
    }
    
}
