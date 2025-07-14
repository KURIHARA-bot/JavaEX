package jp.co.rakuspartners.java.basic2;

public class Ex01 {
    public static void main(String[] args) {
        
    }
   
    int speed;        
    String name;      
    int gasoline;    

    void stepOnAccele() {
        speed += 10;
        gasoline -= 10;
    }

    void stepOnBrake() {
        speed -= 10;
        if (speed < 0) {
            speed = 0; 
        }
    }
}
