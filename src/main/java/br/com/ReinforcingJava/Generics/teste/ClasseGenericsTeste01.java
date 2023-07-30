package br.com.ReinforcingJava.Generics.teste;

import br.com.ReinforcingJava.Generics.dominio.Aviao;
import br.com.ReinforcingJava.Generics.dominio.Barco;
import br.com.ReinforcingJava.Generics.servico.AviaoRentavel;
import br.com.ReinforcingJava.Generics.servico.BarcoRentavel;

public class ClasseGenericsTeste01 {
    public static void main(String[] args) {

        BarcoRentavel barcoRentavel = new BarcoRentavel();

        Barco b = barcoRentavel.buscarBarcoDisponicel();

        barcoRentavel.retornarBarcoAlugado(b);


        AviaoRentavel aviaoRentavel = new AviaoRentavel();

        Aviao a = aviaoRentavel.aviaoDisponicel();

        aviaoRentavel.retornarAviaoAlugado(a);

    }
}
