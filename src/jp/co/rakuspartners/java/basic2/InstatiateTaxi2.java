package jp.co.rakuspartners.java.basic2;

public class InstatiateTaxi2{
    public static void main(String[] args) {
        Taxi taxi = new Taxi();

        taxi.speed = 10;
        taxi.price =1000;

        taxi.stepOnAccele();
        taxi.stepOnAccele();

        

    }

}
