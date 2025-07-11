package jp.co.rakuspartners.java.basic2;

public class PassByReference {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed =10;
        addSpeed10(car);
        System.out.println("メインメソッド内のspeedの値：" + car.speed);
    }
    static void addSpeed10(Car newCar){
      newCar.stepOnAccele();
      System.out.println("addメソッド内のspeedの値:" + newCar.speed);
    }

}
