public class Bank {
    Bank(){

    }
    public float getInterestRate(){
        return 0;
    }
    
}
class TTB extends Bank{
    public float getInterestRate(){
        return 8.4f;
    }
}
class SCB extends Bank{
    public float getInterestRate(){
        return 5.3f;
    }
}