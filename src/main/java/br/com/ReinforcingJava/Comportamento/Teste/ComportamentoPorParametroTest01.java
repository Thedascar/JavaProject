package br.com.ReinforcingJava.Comportamento.Teste;

import br.com.ReinforcingJava.Comportamento.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static   List<Carro> carros = List.of(new Carro("blue",2014)
        ,new Carro("red",2010)
        ,new Carro("rose",2018));



    private static List<Carro> filtrandoCarroVermelho(List<Carro> carro){
        List<Carro> carrosVermelhos = new ArrayList<>();
        for (Carro carro1 : carro) {
            if(carro1.getColor().equals("red")){
                carrosVermelhos.add(carro1);
            }
        }
        return carrosVermelhos;
    }


    public static void main(String[] args) {

        System.out.println( filtrandoCarroVermelho(carros));
    }
}
