package br.com.ReinforcingJava.OOP.polimorfismo.a.teste;


import br.com.ReinforcingJava.OOP.polimorfismo.a.dominio.Celular;
import br.com.ReinforcingJava.OOP.polimorfismo.a.dominio.Computador;
import br.com.ReinforcingJava.OOP.polimorfismo.a.servico.ServicoDeTaxa;

public class TesteB {
    public static void main(String[] args) {
        var comp = new Computador("Not Samsung ci7",3999.00);
        var cel = new Celular("S21 fe 128gb",1999.00);
        cel.setDataDaCompra("29/06/2023");
        ServicoDeTaxa.dizATaxa(comp);
        ServicoDeTaxa.dizATaxa(cel);
    }
}
