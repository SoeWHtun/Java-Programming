public class PrimeNumbers {

    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        System.out.println("The first 50 prime numbers are ");
        while (count < 50) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            num++;
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num <= 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }

        return true;
    }
}
