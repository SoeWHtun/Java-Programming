public class Animal {
    private int age;
    private String food;

    public Animal(){

    }
    public Animal(int age,String food){
        this.age=age;
        this.food=food;
    }
    public void age(){
        System.out.println("Age: "+age);
    }
    public void food(){
        System.out.println("Food: "+food);
    }
}
