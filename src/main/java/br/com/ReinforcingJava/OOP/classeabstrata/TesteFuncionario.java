package br.com.ReinforcingJava.OOP.classeabstrata;

public class TesteFuncionario {
    public static void main(String[] args) {

        var gerente = new Gerente("Lucas",2500.00);
        var dev = new Dev("LucasDev",1500.00);

        System.out.println(gerente);
        System.out.println(dev);
    }
}
