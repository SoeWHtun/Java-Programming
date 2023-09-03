public class WeeklyHour {
    public static void main(String[] args) {
        int[][] hour = { { 2, 4, 3, 4, 5, 8, 8 },
                { 7, 3, 4, 3, 3, 4, 4 },
                { 3, 3, 4, 3, 3, 2, 2 },
                { 9, 3, 4, 7, 3, 4, 1 },
                { 3, 5, 4, 3, 6, 3, 8 },
                { 3, 4, 4, 6, 3, 4, 4 },
                { 3, 7, 4, 8, 3, 8, 4 },
                { 6, 3, 5, 9, 2, 7, 9 }
        };System.out.println("Employee total work hour in decreasing order: ");
        int[][] eachEmployee = new int[hour.length][2];
        for (int row = 0; row < hour.length; row++) {
            int total = 0;
            for (int col = 0; col < hour[0].length; col++) {
                total += hour[row][col];
            }
            eachEmployee[row][0] += total;
            eachEmployee[row][1] += row;
            
        }
        for (int i = 0; i < hour.length - 1; i++) {
            int temp = 0;
            for (int j = 0; j < hour.length - 1 - i; j++) {
                if (eachEmployee[j][0] < eachEmployee[j + 1][0]) {
                    temp = eachEmployee[j][0];
                    eachEmployee[j][0] = eachEmployee[j + 1][0];
                    eachEmployee[j + 1][0] = temp;
                }

            }
        }
        for (int i = 0; i < hour.length; i++) {
            System.out.println(eachEmployee[i][0]);
        }
    }

}
