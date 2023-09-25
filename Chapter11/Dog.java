public class Dog extends Animal {
    private String name;
    
    
    Dog(int age,String food,String name){
        super(age, food);
        this.name = name;
    }
    public void name(){
        System.out.println("Name: "+name);
    }
    public void sound(){
        System.out.println("The sound of the animal is barking ");
    }
}
