package jp.co.rakuspartners.java.basic2;


public class Car {
    int speed;
    String name;
    int gasoline;

    Car(){}

    Car(int newSpeed,String newName, int newGasoline){
        speed = newSpeed;
        name = newName;
        gasoline = newGasoline;}

    void stepOnAccele(){
        speed = speed +10;
        System.out.println("スピードが" + speed +"Km/hに増えました");
    }
    
    void stepOnBrake(){
        speed = speed -10;
        System.out.println("スピードが" + speed +"Km/hに減りました");
    }

    void display(){
        System.out.println(name + "の速度は" + speed + "km/hでガソリン残量は" + gasoline + "リットルです");

    }

}
