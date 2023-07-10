package br.com.BoraJava.Utilitarias.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFomartterTeste01 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20211019",DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);

        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBr = LocalDate.now().format(formatterBr);
        System.out.println(formatBr);


    }
}
