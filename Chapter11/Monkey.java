public class Monkey extends Animal {
    private String name;
    Monkey(int age,String food,String name){
        super(age, food);
        this.name = name;
    }
    public void name(){
        System.out.println("Name: "+name);

    }
    public void sound(){
        System.out.println("The sound of the animal is Kookr-KoKohKrrrkr");
    }
    
}
