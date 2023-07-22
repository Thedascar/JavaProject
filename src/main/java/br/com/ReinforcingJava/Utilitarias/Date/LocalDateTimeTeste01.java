package br.com.ReinforcingJava.Utilitarias.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {
        LocalDateTime timeDate = LocalDateTime.now();
        System.out.println(timeDate);
        System.out.println(timeDate.getDayOfMonth());
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time2 = LocalTime.parse("09:45:00");
        System.out.println(date);
        System.out.println(time2);

        LocalDateTime dt1 = date.atTime(time2);
        System.out.println(dt1);
    }
}
