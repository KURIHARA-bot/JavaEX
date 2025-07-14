package jp.co.rakuspartners.java.basic3;

public class Bus extends Car{

    public int price;

    public Bus(int price,int speed){
        this.price=price;
        this.speed=speed;
    }

    @Override

    protected void stepOnAccele(){
        // speed = speed +10;
        // System.out.println("スピードは" + speed +"Km/hです");
        super.stepOnAccele();

        price =price +30;
        System.out.println("料金は"+ price +"円です");
    }

}
