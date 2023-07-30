package br.com.ReinforcingJava.Generics;


import java.util.List;

public class WildCardsTeste02 {
    public static void main(String[] args) {

        List<Cachorro> c = List.of(new Cachorro());
        List<Gato> g = List.of(new Gato());
        printAnimal(c);
        printAnimal(g);
    }

    private static void printAnimal(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }

    }

    private static void printConsulta(List<? super Animal> a){

        a.add(new Cachorro());
        a.add(new Gato());

    }
}
