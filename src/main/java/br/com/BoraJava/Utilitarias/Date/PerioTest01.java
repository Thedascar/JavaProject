package br.com.BoraJava.Utilitarias.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PerioTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);

        Period p1 = Period.between(now,nowAfterTwoYears);
        Period p2 = Period.ofDays(4);
        Period p3 = Period.ofWeeks(58);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p3.getMonths());
        System.out.println(Period.between(now,now.plusDays(p3.getDays())).getMonths());
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.DAYS));
    }
}
