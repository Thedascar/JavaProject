package br.com.BoraJava.Utilitarias.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat data = new SimpleDateFormat(pattern);
        System.out.println(data.format(new Date()));
    }
}
