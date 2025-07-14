package jp.co.rakuspartners.java.basic2;

public class Ex08 {
    public static void main(String[] args) {
        TV tv = new TV(false,1);
        tv.power=(false);
        tv.channel=(1);

        tv.powerOff();
        tv.setChannel(8);
        tv.display();
        
    }
 

}
