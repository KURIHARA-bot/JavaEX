package jp.co.rakuspartners.java.basic3;

public class Ex05 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setSpeed(30);
        car.setName("エスティマ");

        System.out.println("現在のスピード:"+ car.getSpeed()+"\n名前:"+car.getName());


    }

}
