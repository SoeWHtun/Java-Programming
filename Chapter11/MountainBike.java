public class MountainBike extends Bicycle {
    private int seatHeight;
    MountainBike(int gear,int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight= seatHeight;
    }
    public void setHeight(int seatHeight){
        this.seatHeight=seatHeight;
    }
    @Override
    public String toString(){
        return(super.toString()+"\nSeat height is "+seatHeight);
    }
    
}
