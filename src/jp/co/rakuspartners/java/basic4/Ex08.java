package jp.co.rakuspartners.java.basic4;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex08 {
    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.of(2020,02,01);

        localDate= localDate.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(localDate.getDayOfMonth());

    
    }

}
