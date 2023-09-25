public class Bicycle {
    private int gear;
    private int speed;
    public Bicycle(int gear,int speed){
         this.gear = gear;
         this.speed=speed;

    }
    public void applyBrake(int decreasement){
        speed-=decreasement;
    }
    public void speedUp(int increasement){
        speed+=increasement;
    }
    public String toString(){
        return ("No of gears are "+gear+"\n"+"Speed of the bicycle is "+speed);
    }
    
}
