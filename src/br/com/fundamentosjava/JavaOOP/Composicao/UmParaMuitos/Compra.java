package br.com.fundamentosjava.JavaOOP.Composicao.UmParaMuitos;

import br.com.fundamentosjava.JavaOOP.Composicao.Desafio.ItemDesafio;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    double valorTotal(){
        double total = 0;
        for (Item item:
             itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }

    void adicionarItem(Item item){
        this.itens.add(item);
        item.compra = this;
    }

    void adicionarItem(String nome,int quantidade,double preco){
        this.itens.add(new Item(nome,quantidade,preco));
    }

}
