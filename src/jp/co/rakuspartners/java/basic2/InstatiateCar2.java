package jp.co.rakuspartners.java.basic2;

public class InstatiateCar2 {
    public static void main(String[] args) {
        Car2 car = new Car2(0,"エステマ");

        //car.speed = 0;
        //car.name ="エスティマ";

        car.stepOnAccele();
        car.stepOnAccele();
        car.stepOnBrake();

        System.out.println("現在の速度は" + car.speed + "km/hです。");

    }

}
