package br.com.BaseJava.JavaOOP.ClasseProduto;
public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(){}
    Produto(String nomeProduto,double precoProduto){
        nome = nomeProduto;
        preco = precoProduto;
    }

    double descontoProduto(){
        return preco * (1 - desconto);
    }
}
