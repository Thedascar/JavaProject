package br.com.BoraJava.OOP.classenum.enumm;

public class TesteDog {
    public static void main(String[] args) {

        var dog = new Dog("Bob",TipoRaca.VIRA_LATA);
        var dog2 = new Dog("Bacon",TipoRaca.LHASA);

        System.out.println(dog);
        System.out.println(dog2);
    }
}
