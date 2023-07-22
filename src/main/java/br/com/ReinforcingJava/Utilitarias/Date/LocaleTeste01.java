package br.com.ReinforcingJava.Utilitarias.Date;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {

        Locale localeBrasil = new Locale("pt","BR");
        Locale localeItalia = new Locale("it","IT");
        Locale localeHolanda = new Locale("nl","NL");
        Locale lcoaleIndia = new Locale("hi","IN");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeBrasil);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeItalia);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeHolanda);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,lcoaleIndia);


        System.out.println(df1.format(calendar.getTime()));
        System.out.println(df2.format(calendar.getTime()));
        System.out.println(df3.format(calendar.getTime()));
        System.out.println(df4.format(calendar.getTime()));
    }
}
