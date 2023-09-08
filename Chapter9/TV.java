public class TV {
    int channel;
    int volumeLevel;
    boolean on = false;

    TV(){

    }
    void tvon(){
        on=true;
    }
    void tvoff(){
        on=false;
    }
    void setChannel(int newChannel){
        if(on && newChannel>=1 && newChannel<=120){
        channel=newChannel;}
    }
    void setVolumelevel(int newVolume){
        if(on && newVolume>=1 && newVolume<=7){
        volumeLevel=newVolume;}
    }
    void channelup(){
        if(on&& channel<120){
            channel++;
        }
    }
    void channeldown(){
        if(on&& channel>1){
            channel--;
        }
    }
    void volumeup(){
        if(on&& volumeLevel<7){
        volumeLevel++;}
    }
    void volumedown(){
        if(on&& volumeLevel>1){
        volumeLevel--;}
    }
}

