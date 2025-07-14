package jp.co.rakuspartners.java.basic2;

public class Car2 {
    int speed;
    String name;

    Car2(int newSpeed,String newName){
        speed = newSpeed;
        name = newName;
    }

    void stepOnAccele(){
        speed = speed +10;
        System.out.println("スピードが" + speed +"Km/hに増えました");
    }
    
    void stepOnBrake(){
        speed = speed -10;
        System.out.println("スピードが" + speed +"Km/hに減りました");
    }

}
