package jp.co.rakuspartners.java.basic2;

public class Ex17 {
    public static void main(String[] args) {
        
        EX17Bicycle bike = new EX17Bicycle();

        bike.setBearing("北");
        bike.turnLeft();
        bike.turnRight();
        bike.turnLeft();
        bike.turnLeft();
        bike.turnRight();
        bike.turnLeft();
        bike.display();
    }

}
