package br.com.BoraJava.Utilitarias.Date;

import java.time.*;
import java.util.Map;

public class ZoneTeste01 {
    public static void main(String[] args) {
        Map<String, String> shorIds = ZoneId.SHORT_IDS;
        System.out.println(shorIds);
        ZoneId zoneTokio = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneTokio);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zoneDateTime = now.atZone(zoneTokio);
        System.out.println(zoneDateTime);

        Instant nowInstant = Instant.now();
        ZonedDateTime zoneDateTime2 = nowInstant.atZone(zoneTokio);
        System.out.println(zoneDateTime2);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);


    }
}
