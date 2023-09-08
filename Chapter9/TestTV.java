public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.tvon();
        tv1.setChannel(35);
        tv1.setVolumelevel(3);
        System.out.println("TV1's channel is "+tv1.channel+" and the volume is "+tv1.volumeLevel);
        TV tv2 = new TV();
        tv2.tvon();
        tv2.channelup();
        tv2.channelup();
        tv2.volumeup();
        tv2.volumeup();
        System.out.println("TV2's channel is "+tv2.channel+" and the volume is "+tv2.volumeLevel);
        TV tv3 = new TV();
        tv3.tvon();
        tv3.setChannel(30);
        tv3.setVolumelevel(3);
        tv3.channeldown();
        tv3.volumedown();
        System.out.println("TV3's channel is "+tv3.channel+" and the volume is "+tv3.volumeLevel );
    }
    
}
