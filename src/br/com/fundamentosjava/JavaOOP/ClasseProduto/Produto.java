package br.com.fundamentosjava.JavaOOP.ClasseProduto;
public class Produto {
    String nome;
    double preco;
    double desconto;

    double descontoProduto(){
        return preco * (1 - desconto);
    }
}
