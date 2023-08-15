package br.com.ReinforcingJava.PadroesDeProjetos.teste;

import br.com.ReinforcingJava.PadroesDeProjetos.dominio.Aircraft;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        Aircraft aircraft = new Aircraft("787-AA");
        System.out.println(aircraft.bookSeat(seat));
    }
}
