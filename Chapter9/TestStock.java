public class TestStock {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL","Oracle Corporation");
         stock1.setCurrentPrice(34.35);
         stock1.setPreviousPrice(34.5);
         System.out.print("Price Change percentage is ");
         stock1.getChangePercent();
         System.out.print("%");
    }
}
