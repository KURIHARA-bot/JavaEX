package jp.co.rakuspartners.java.basic2;

public class TV {
    boolean power;
    int channel;

    TV(boolean power,int channel){
        this.power=power;
        this.channel =channel;
    }

    void powerOn(){
        power = true;
        System.out.println("電源ON");
    }
    void powerOff(){
        power = false;
        System.out.println("電源OFF");
    }

    void setChannel (int newChannel){
        if(power == false){
            System.out.println("電源を入れてください");
        }else{
        channel = newChannel;
        }
        
    }
    void display(){
        if(power ==false){
            System.out.println("電源を入れてください");
        }else{
        System.out.println("現在"+ channel +"チャンネルを表示しています");
        }

}
}
