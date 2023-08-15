package br.com.ReinforcingJava.PadroesDeProjetos.teste;

import br.com.ReinforcingJava.PadroesDeProjetos.dominio.AirCraftSingletonLazy;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        AirCraftSingletonLazy airCraftSingletonLazy = AirCraftSingletonLazy.getINSTANCE();
        System.out.println(airCraftSingletonLazy.bookSeat(seat));
    }
}
