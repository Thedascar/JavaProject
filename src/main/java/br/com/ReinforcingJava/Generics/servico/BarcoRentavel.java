package br.com.ReinforcingJava.Generics.servico;



import br.com.ReinforcingJava.Generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavel {
    private List<Barco> barcosDisponiveis = new ArrayList<>(
            List.of(new Barco("barco 1"), new Barco("barco 2")));

            public Barco buscarBarcoDisponicel(){
                System.out.println("Buscando Barco.java disponivel");
                Barco barco = barcosDisponiveis.remove(0);
                System.out.println("Alugando barco: " + barco);
                System.out.println("Barcos Disponiceis para alugar");
                System.out.println(barcosDisponiveis);
                return barco;
        }

        public void retornarBarcoAlugado(Barco barco){
            System.out.println("Devolvendo braco " + barco);
            barcosDisponiveis.add(barco);
            System.out.println("Barcos Disponiceis para alugar");
            System.out.println(barcosDisponiveis);
        }

}
