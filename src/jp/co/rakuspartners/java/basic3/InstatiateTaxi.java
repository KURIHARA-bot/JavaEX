package jp.co.rakuspartners.java.basic3;

public class InstatiateTaxi {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();

        taxi.speed = 0;
        taxi.name ="タクシー仕様のエスティマ";

        taxi.stepOnAccele();
        taxi.stepOnAccele();
        taxi.stepOnBrake();

        System.out.println("現在の速度は" + taxi.speed + "km/hです。");

    }

}
