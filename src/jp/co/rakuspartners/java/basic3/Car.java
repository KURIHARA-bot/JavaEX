package jp.co.rakuspartners.java.basic3;

/**
 * 車を表すクラスです
 * 
 * @author
 */
public class Car {
    int speed;
    String name;
    
    /**
     * スピードを増やす
     */
    public void stepOnAccele() {
        speed = speed + 10;
        System.out.println("スピードが" + speed + "Km/hに増えました");

    }

    /**
     * 
     * @return
     */

    public int getSpeed() {
        return speed;
    }
     /**
      * 
      * @param speed
      */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * スピードを減らします
     */
    public void stepOnBrake() {
        speed = speed - 10;
        System.out.println("スピードが" + speed + "Km/hに減りました");
    }

    @Override
    public String toString() {
        return "Car [speed=" + speed + ", name=" + name + "]";
    }

}
