package jp.co.rakuspartners.java.basic2;

public class Ex08 {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.power=(false);
        tv.channel=(1);

        tv.powerOn();
        tv.setChannel(8);
        tv.display();
        tv.powerOff();
    }


}
