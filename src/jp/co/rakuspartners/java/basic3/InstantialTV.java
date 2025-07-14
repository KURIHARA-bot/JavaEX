package jp.co.rakuspartners.java.basic3;

public class InstantialTV {
    public static void main(String[] args) {
        
         TV sonyTv = new TV(5);

         sonyTv.changeChannel(5);

         TV sharpTv =new TV(13);

         sharpTv.changeChannel(13);
    }

}
