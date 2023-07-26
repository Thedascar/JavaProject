package br.com.ReinforcingJava.Collections.teste;

import br.com.ReinforcingJava.Collections.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTeste01 {
    public static void main(String[] args) {

        NavigableMap<String,String> a = new TreeMap();
        a.put("A","1");
        a.put("B","2");
        a.put("C","3");
        a.put("D","4");
        a.put("E","5");


        for (Map.Entry<String, String> entry : a.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        System.out.println(a.headMap("D",true));
    }
}
