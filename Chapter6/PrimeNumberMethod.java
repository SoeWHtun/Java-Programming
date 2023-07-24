public class PrimeNumberMethod {
    public static void main(String[] args) {
      System.out.println("The first 50 prime numbers are \n ");
      printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int Number_Of_Prime_Per_Line = 10;
        int count = 0;
        int number = 2;

        while (count < numberOfPrimes) {
            if (isPrime(number)) {
                count++;
                if (count % Number_Of_Prime_Per_Line == 0) {
                    System.out.printf("%5d\n" ,number);

                } else {
                    System.out.printf("%5d" , number);
                }
            }
            number++;
        }
    }
        public static boolean isPrime(int number){
            for(int divisor=2;divisor<=number/2;divisor++){
                if ( number % divisor == 0 ){
                    return false;
                }

            }
                return true;
        }
    

}
