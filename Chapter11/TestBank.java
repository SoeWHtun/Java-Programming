public class TestBank { 
    public static void main(String[] args) {
        Bank b =new Bank();
        System.out.println("Bank Interest Rate is "+b.getInterestRate());
        SCB scb = new SCB();
        System.out.println("SCB Bank Interest Rate is "+scb.getInterestRate());
        TTB ttb = new TTB();
        System.out.println("TTB Bank Interest Rate is "+ttb.getInterestRate());
    }
    
}
