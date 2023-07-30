package br.com.ReinforcingJava.Generics.teste;

import br.com.ReinforcingJava.Generics.dominio.Aviao;
import br.com.ReinforcingJava.Generics.dominio.Barco;
import br.com.ReinforcingJava.Generics.servico.Aluguel;
import br.com.ReinforcingJava.Generics.servico.AviaoRentavel;
import br.com.ReinforcingJava.Generics.servico.BarcoRentavel;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericsTeste02 {
    public static void main(String[] args) {

        List<Barco> barcosDisponiveis = new ArrayList<>(
                List.of(new Barco("barco 1"), new Barco("barco 2")));
        List<Aviao> aviaoDisponiveis = new ArrayList<>(
                List.of(new Aviao("aviao 1"), new Aviao("aviao 2")));

        Aluguel<Barco> aluguel = new Aluguel<>(barcosDisponiveis);
        Barco a = aluguel.buscarBarcoDisponicel();
        aluguel.retornarBarcoAlugado(a);
        Aluguel<Aviao> aluguel2 = new Aluguel<>(aviaoDisponiveis);
        Aviao b =  aluguel2.buscarBarcoDisponicel();
        aluguel2.retornarBarcoAlugado(b);


    }
}
