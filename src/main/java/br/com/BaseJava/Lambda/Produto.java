package br.com.BaseJava.Lambda;

public class Produto {
    public String nome;
    public double preco;
    public   double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        double precoFinal = (1 - desconto) * preco;
    return "Nome " + nome + "tem preço de R$" + (preco - precoFinal);
    }
}
