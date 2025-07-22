package jp.co.rakuspartners.java.basic4;

import java.time.LocalDate;

public class Ex07 {
    public static void main(String[] args) {
        
        LocalDate me = LocalDate.of(2000,01,26);

        int year =me.getYear();
        int month =me.getMonthValue();
        int day =me.getDayOfMonth();

        System.out.println("私の誕生日は"+ year+"年"+month+"月"+day+"日です");


    }

}
