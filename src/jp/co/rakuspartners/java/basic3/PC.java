package jp.co.rakuspartners.java.basic3;

public class PC implements Electrical{

    private boolean powerOn;


    public PC(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }
    
    @Override
    public void power(){
        if(powerOn==true){
            powerOn=false;
            System.out.println("PCの電源が切れました");

        }else if(powerOn==false){
            System.out.println("設定ファイルを読み込んでいます");
            powerOn=true;
            System.out.println("PCの電源が入りました");
        }
    } 

}

    