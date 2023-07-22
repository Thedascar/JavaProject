package br.com.ReinforcingJava.OOP.polimorfismo.a.dominio;

public class Computador extends Produto{
    public Computador(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double taxa() {
        return preco * 0.50;
    }
}
