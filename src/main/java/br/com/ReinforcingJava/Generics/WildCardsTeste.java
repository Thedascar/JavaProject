package br.com.ReinforcingJava.Generics;


abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal{
    @Override
    public void consulta() {
        System.out.println("consultando cachorro");
    }
}
class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("consultando gato");
    }
}


public class WildCardsTeste {
    public static void main(String[] args) {
        Cachorro[] dog = {new Cachorro(),new Cachorro(),new Cachorro(),new Cachorro()};
        Gato[] cat = {new Gato(),new Gato(),new Gato(),new Gato(),new Gato(),new Gato()};
        printAnimal(dog);
        printAnimal(cat);
    }

    private static void printAnimal(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }

    }
}
