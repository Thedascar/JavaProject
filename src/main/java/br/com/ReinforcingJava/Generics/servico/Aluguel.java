package br.com.ReinforcingJava.Generics.servico;

import java.util.List;

public class Aluguel<T> {
    private final List<T> disponiveis;

    public Aluguel(List<T> disponiveis){
        this.disponiveis = disponiveis;
    }

    public T buscarBarcoDisponicel(){
        System.out.println("Buscando disponivel");
        T t = disponiveis.remove(0);
        System.out.println("Alugando: " + t);
        System.out.println("Disponiveis para alugar");
        System.out.println(disponiveis);
        return t;
    }

    public void retornarBarcoAlugado(T t){
        System.out.println("Devolvendo...." + t.toString());
        disponiveis.add(t);
        System.out.println("Disponiveis para alugar");
        System.out.println(disponiveis);
    }

}
