package jp.co.rakuspartners.java.basic2;

public class TV {
    boolean power;
    int channel;

    void powerOn(){
        System.out.println("電源ON");
    }
    void powerOff(){
        System.out.println("電源OFF");
    }

    void setChannel (int newChannel){
        channel = newChannel;
    }
    void display(){
        System.out.println("現在"+ channel +"チャンネルを表示しています");
    

}
}
