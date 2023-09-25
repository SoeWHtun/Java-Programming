public class TestOverloading {
 public static void main(String[] args) {
    B a = new B();
    a.p(10);
    
 }

}
class B{
    public void p(double i){
        System.out.println("class B method "+i*2);
    } 
}
class A extends B{
    public void p(double i){
        System.out.println("class A method "+i);
    } 
}
