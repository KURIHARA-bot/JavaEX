package jp.co.rakuspartners.java.basic2;

public class Taxi extends Car{
    int price;

    void payment(){
        System.out.println("料金を" +price+"円支払いました");
        price=0;
    }

}
