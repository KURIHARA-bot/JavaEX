package jp.co.rakuspartners.java.basic4;

public class Ex15 {
    public static void main(String[] args) {

        Car car = new Car();

        car.run(200);

        try {
            car.run(200);
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
    }

}
