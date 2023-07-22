package br.com.ReinforcingJava.OOP.interfaces;

public class Dog implements DogLatir,DogRaca{
    @Override
    public void latir() {
        System.out.println("AuauaUAAUA da interface latir");
    }

    @Override
    public void raca() {
        System.out.println("Vira lata da interface raca");
    }


}
