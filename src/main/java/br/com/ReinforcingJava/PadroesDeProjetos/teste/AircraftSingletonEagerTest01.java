package br.com.ReinforcingJava.PadroesDeProjetos.teste;

import br.com.ReinforcingJava.PadroesDeProjetos.dominio.AirCraftSingletonEager;
import br.com.ReinforcingJava.PadroesDeProjetos.dominio.Aircraft;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        AirCraftSingletonEager airCraftSingletonEager = AirCraftSingletonEager.getINSTANCE();
        System.out.println(airCraftSingletonEager.bookSeat(seat));
    }
}
