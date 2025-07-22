package jp.co.rakuspartners.java.basic4;

public class Car {

    private int speed;

    public void run(int speed) {
        if (speed < 0 || speed > 180) {
            throw new IllegalArgumentException("スピードの出し過ぎです");

        } else if (speed >= 0 && speed <= 180) {
            this.speed = speed;
            System.out.println("スピードが" + this.speed + "Km/hになりました");

        }

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
