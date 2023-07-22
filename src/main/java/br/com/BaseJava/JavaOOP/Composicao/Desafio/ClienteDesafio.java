package br.com.BaseJava.JavaOOP.Composicao.Desafio;

import java.util.ArrayList;

public class ClienteDesafio {
    String nome;
    ArrayList<CompraDesafio> compra = new ArrayList<>();

    ClienteDesafio(String nome){
        this.nome = nome;
    }

    void addCompra(CompraDesafio compra){
        this.compra.add(compra);
    }



}
