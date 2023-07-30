import java.util.*;

public class StudentMajorStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two character: ");
        String code = input.nextLine();
        char major = code.charAt(0);
        char year = code.charAt(1);
        if (major == 'M' || major == 'm') {
            System.out.print("Mathematics ");
            YearChecker(year);
        } else if (major == 'C' || major == 'c') {
            System.out.print("Computer Science ");
            YearChecker(year);
        } else if (major == 'I' || major == 'i') {
            System.out.print("Information technology ");
            YearChecker(year);
        } else {
            System.out.println("Wrong Input for student major");
            if(year > '4'){
                System.out.println("Wrong Input for student status");
            }

        }
    }

    public static void YearChecker(char a) {
        switch (a) {
            case '1':
                System.out.println("Freshman");
                break;
            case '2':
                System.out.println("Sophomore");
                break;
            case '3':
                System.out.println("Junior");
                break;
            case '4':
                System.out.println("Senior");
                break;
            default:
                System.out.println("\nWrong input for student status");
                break;
        }

    }
}
