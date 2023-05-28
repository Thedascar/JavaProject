package br.com.fundamentosjava.Generics.SemGenerics;

import java.io.ObjectStreamException;

public class CaixaSemGenerics {

    private Object coisa;


    public void guardar(Object coisa){
        this.coisa = coisa;
    }

    public Object abrir(){
        return coisa;
    }
}
