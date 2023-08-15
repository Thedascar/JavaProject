package br.com.ReinforcingJava.PadroesDeProjetos.teste;

import br.com.ReinforcingJava.PadroesDeProjetos.dominio.Moeda;
import br.com.ReinforcingJava.PadroesDeProjetos.dominio.MoedaFactory;
import br.com.ReinforcingJava.PadroesDeProjetos.dominio.Pais;

public class MoedaFactoryTest {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.novaMoeda(Pais.BRAZIL);
        System.out.println(moeda.simbolo());
    }
}
