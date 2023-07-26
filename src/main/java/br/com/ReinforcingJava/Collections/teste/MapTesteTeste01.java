package br.com.ReinforcingJava.Collections.teste;

import java.util.HashMap;
import java.util.Map;

public class MapTesteTeste01 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap();
        map.put("dog1","Bacon");
        map.put("dog2","Bob");
        map.put("baby","liz or bernardo");
        map.put("babybay","new nenem liz or bernardo");


        for ( String a : map.values()) {
            System.out.println(a);
        }
        System.out.println("---------------------");
        for(Map.Entry<String,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+ " -> "+ entry.getValue());
        }


    }


}
