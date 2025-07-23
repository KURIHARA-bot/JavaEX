package jp.co.rakuspartners.java.basic4.practice34;

import jp.co.rakuspartners.java.basic4.practice34.Ex05.Month;

public class Ex06 {
    public static void main(String[] args) {
        
        Month july = Month.of(7);
        System.out.println(july.getJapanese());
        System.out.println(july.getDescription());
        System.out.println(july.getEvent());
    }

}
