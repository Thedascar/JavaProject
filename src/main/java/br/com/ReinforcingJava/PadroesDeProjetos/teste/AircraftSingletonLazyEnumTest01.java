package br.com.ReinforcingJava.PadroesDeProjetos.teste;

import br.com.ReinforcingJava.PadroesDeProjetos.dominio.AirCraftSingletonLazy;
import br.com.ReinforcingJava.PadroesDeProjetos.dominio.AircraftSingletonEnum;

public class AircraftSingletonLazyEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }
    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEnum.INSTANCE);
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
