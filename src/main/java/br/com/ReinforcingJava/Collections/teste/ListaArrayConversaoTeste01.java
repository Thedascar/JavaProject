package br.com.ReinforcingJava.Collections.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTeste01 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Integer[] listToArray = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));


        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 4;
        numerosArray[1] = 5;
        numerosArray[2] = 6;

        List<Integer> list1 = Arrays.asList(numerosArray);
        list1.set(0,12);
        System.out.println(list1);


        List<Integer> lista = new ArrayList<>(Arrays.asList(numerosArray));
        lista.add(15);
        System.out.println(lista);
    }
}
