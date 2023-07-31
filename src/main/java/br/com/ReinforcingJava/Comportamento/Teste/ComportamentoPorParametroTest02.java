package br.com.ReinforcingJava.Comportamento.Teste;

import br.com.ReinforcingJava.Comportamento.dominio.Carro;
import br.com.ReinforcingJava.Comportamento.interfaces.CarroPredicado;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static   List<Carro> carros = List.of(new Carro("blue",2014)
        ,new Carro("red",2010)
        ,new Carro("rose",2018));


    private static List<Carro> filtrando(List<Carro> carro, Predicate<Carro> carroPredicado){
        List<Carro> carrosFiltro = new ArrayList<>();
        for (Carro carro1 : carro) {
            if(carroPredicado.test(carro1)){
                carrosFiltro.add(carro1);
            }
        }
        return carrosFiltro;
    }

    private static <T> List<T> filter(List<T> list,Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T t : list) {
            if(predicate.test(t)){
                filteredList.add(t);
            }
        }
        return filteredList;
    }


    public static void main(String[] args) {

       List<Carro> blue =  filtrando(carros,a -> a.getColor().equals("blue"));
        List<Carro> red =  filtrando(carros,a -> a.getColor().equals("red"));
        System.out.println(blue);
        System.out.println(red);

        List<Integer> num = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(num,a -> a % 2 == 0));
    }
}

