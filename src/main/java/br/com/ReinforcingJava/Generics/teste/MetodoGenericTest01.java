package br.com.ReinforcingJava.Generics.teste;

import br.com.ReinforcingJava.Generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericTest01 {
    public static void main(String[] args) {

    List<Barco> a = criarArray(new Barco("Novo Barco"));
        System.out.println(a);
    }

    private static <T> List<T> criarArray(T t){
        return List.of(t);
    }
}
