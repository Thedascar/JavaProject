package br.com.fundamentosjava.JavaOOP.Composicao.Desafio;

import java.util.ArrayList;

public class CompraDesafio {
    ArrayList<ItemDesafio> item = new ArrayList<>();
    double total;

    void addItem(ItemDesafio item){
        this.item.add(item);
    }

    double obterValortotal(){

        for (int i = 0; i < item.size(); i++) {
               double a =  item.get(i).produto.preco;
               int b =  item.get(i).produto.quantidade;
               total += a * b;
            }
            return total;

        }
    }
