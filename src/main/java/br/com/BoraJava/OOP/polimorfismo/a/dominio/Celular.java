package br.com.BoraJava.OOP.polimorfismo.a.dominio;

public class Celular extends Produto{
    public Celular(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double taxa() {
        return preco * 0.20;
    }
}
