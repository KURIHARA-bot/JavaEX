package jp.co.rakuspartners.java.basic3;


public class Car {
    protected int speed;
    protected String name;
    

    

    protected void stepOnAccele(){
        speed = speed +10;
        System.out.println("スピードが" + speed +"Km/hに増えました");
        
    }
    
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void stepOnBrake(){
        speed = speed -10;
        System.out.println("スピードが" + speed +"Km/hに減りました");
    }

    @Override
    public String toString() {
        return "Car [speed=" + speed + ", name=" + name + "]";
    }

    
    
    }
