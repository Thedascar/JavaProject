package br.com.BoraJava.Utilitarias.Date;

import br.com.BoraJava.OOP.domain.relationship.Local;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTeste01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(now,nowAfterTwoYears);
        System.out.println(d1);

    }
}
