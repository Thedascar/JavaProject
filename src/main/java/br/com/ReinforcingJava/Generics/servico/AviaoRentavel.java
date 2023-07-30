package br.com.ReinforcingJava.Generics.servico;

import br.com.ReinforcingJava.Generics.dominio.Aviao;

import java.util.ArrayList;
import java.util.List;

public class AviaoRentavel {
    private List<Aviao> aviaoDisponiveis = new ArrayList<>(
            List.of(new Aviao("aviao 1"), new Aviao("aviao 2")));

            public Aviao aviaoDisponicel(){
                System.out.println("Buscando Barco.java disponivel");
                Aviao aviao = aviaoDisponiveis.remove(0);
                System.out.println("Alugando barco: " + aviao);
                System.out.println("Barcos Disponiceis para alugar");
                System.out.println(aviaoDisponiveis);
                return aviao;
        }

        public void retornarAviaoAlugado(Aviao aviao){
            System.out.println("Devolvendo braco " + aviao);
            aviaoDisponiveis.add(aviao);
            System.out.println("Barcos Disponiceis para alugar");
            System.out.println(aviaoDisponiveis);
        }

}
