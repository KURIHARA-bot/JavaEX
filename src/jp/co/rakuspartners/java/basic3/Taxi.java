package jp.co.rakuspartners.java.basic3;

public class Taxi extends Car{
     protected int price;

    protected void payment(){
        System.out.println("料金を" +price+"円支払いました");
        price=0;
    }

    @Override

    protected void stepOnAccele(){
        // speed =speed+10;
        // System.out.println("スピードが" + speed +"Km/hに増えました");
        super.stepOnAccele();

        price = price+90;
        System.out.println("料金が"+price+"円に増えました");
    }

}
