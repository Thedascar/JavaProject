package br.com.ReinforcingJava.Utilitarias.Date;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();

        System.out.println(c);
        System.out.println(date);

        System.out.println(c.getFirstDayOfWeek());
        System.out.println("domingo " + c.get(Calendar.SUNDAY));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
    }
}
