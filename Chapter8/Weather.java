import java.util.Scanner;
public class Weather {
    public static void main(String[] args) {
        final int Numberofdays = 10;
        final int NumberofHours = 24;
        double[][][] data = new double[Numberofdays][NumberofHours][2];
        Scanner input = new Scanner(System.in);
        for (int k =0;k<Numberofdays*NumberofHours;k++){
            int day = input.nextInt();
            int hour = input.nextInt();
            double temperature = input.nextDouble();
            double humidity = input.nextDouble();
            data[day - 1][hour - 1][0]=temperature;
            data[day - 1][hour - 1][1]=humidity;

        }
        input.close();
    
    for(int row =0;row<Numberofdays;row++){
    double dailytemperature = 0;
    double dailyhumidity = 0;
    
    for(int col = 0;col<NumberofHours;col++){
        dailytemperature+=data[row][col][0];
        dailyhumidity+=data[row][col][1];
    }
    System.out.println("Day "+(row+1)+" 's average temperature is "+dailytemperature/NumberofHours);
     System.out.println("Day "+(row+1)+" 's average humidity is "+dailyhumidity/NumberofHours);
    }
}
}
