package br.com.ReinforcingJava.OOP.interfaces;

public class TesteInterfaceDog {
    public static void main(String[] args) {

        var dog = new Dog();

        dog.latir();
        dog.raca();
        dog.naoprecisa();

        DogRaca.dograca();
        DogLatir.doglatir();
    }
}
