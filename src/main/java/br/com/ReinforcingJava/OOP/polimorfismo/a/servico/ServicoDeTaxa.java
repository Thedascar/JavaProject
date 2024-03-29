package br.com.ReinforcingJava.OOP.polimorfismo.a.servico;

import br.com.ReinforcingJava.OOP.polimorfismo.a.dominio.Celular;
import br.com.ReinforcingJava.OOP.polimorfismo.a.dominio.Produto;

public class ServicoDeTaxa {
    public static void dizATaxa(Produto produto){
        System.out.println("O produto -> " + produto.getNome());
        System.out.println("Tinha o valor de -> " + produto.getPreco());
        System.out.println("Valor da taxa ->: " + produto.taxa());
        System.out.println("Valor total com taxa -> " + (produto.getPreco() + produto.taxa()));
        if(produto instanceof Celular){
            Celular celular = (Celular) produto;
            System.out.println(celular.getDataDaCompra());
        }
    }
}
