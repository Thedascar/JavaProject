package br.com.BaseJava.Generics.ComGenerics;

public class CaixaComGenerics<T> {

    private T coisa;


    public void guardar(T coisa){
        this.coisa = coisa;
    }

    public T abrir(){
        return coisa;
    }
}
