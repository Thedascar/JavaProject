package br.com.BoraJava.OOP.polimorfismo.a.servico;

import br.com.BoraJava.OOP.polimorfismo.a.dominio.Produto;

public class ServicoDeTaxa {
    public static void dizATaxa(Produto produto){
        System.out.println("O produto -> " + produto.getNome());
        System.out.println("Tinha o valor de -> " + produto.getPreco());
        System.out.println("Valor da taxa ->: " + produto.taxa());
        System.out.println("Valor total com taxa -> " + (produto.getPreco() + produto.taxa()));
    }
}
