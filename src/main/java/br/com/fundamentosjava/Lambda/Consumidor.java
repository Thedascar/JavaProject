package br.com.fundamentosjava.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Produto p1 = new Produto("celular",3500.87,0.15);
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        imprimir.accept(p1);
        Produto p2 = new Produto("notebook",3500.87,0.15);
        Produto p3 = new Produto("tv",1500.87,0.5);
        Produto p4 = new Produto("tablet",500.87,0.32);
        Produto p5 = new Produto("geladeira",8500.87,0.8);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);

        produtos.forEach(imprimir);
        produtos.forEach(produto -> System.out.println(produto.preco));
        produtos.forEach(System.out::println);
    }
}
