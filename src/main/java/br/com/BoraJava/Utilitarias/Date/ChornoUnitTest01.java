package br.com.BoraJava.Utilitarias.Date;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChornoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1995, Month.JANUARY,11,15,30,8);

        System.out.println(ChronoUnit.DAYS.between(aniversario,LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(aniversario,LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(aniversario,LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(aniversario,LocalDateTime.now()));
    }
}
