package br.com.BoraJava.Utilitarias.Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;


public class TemporalAdjustesTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH,18);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.TUESDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());



    }
}
