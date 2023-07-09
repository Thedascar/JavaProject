package br.com.BoraJava.Utilitarias.Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;


class ObterProximoDiautil implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = 1;
        switch (dayOfWeek){
            case FRIDAY -> addDays = 3;
            case SATURDAY -> addDays = 2;
            case THURSDAY -> addDays = 4;
            default -> addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}



public class TemporalDjusterExercico01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());



        now = LocalDate.now().withDayOfMonth(13).with(new ObterProximoDiautil())
;       System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(14).with(new ObterProximoDiautil())
        ;       System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(15).with(new ObterProximoDiautil())
        ;       System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
