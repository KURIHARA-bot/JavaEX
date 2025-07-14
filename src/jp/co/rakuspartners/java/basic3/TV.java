package jp.co.rakuspartners.java.basic3;

public class TV {
    protected int channel;

    public TV(int channel) {
        this.channel = channel;
    }

    protected void changeChannel(int channel){
       if(channel<=0 || 13<=channel){
            System.out.println("チャンネルは1~12までの間で設定してください");
            
            //throw new Exception("チャンネルは1~12までの間で設定してください");
        }
        this.channel=channel;
        System.out.println(this.channel +"チャンネルに切り替わりました");

    }

}
