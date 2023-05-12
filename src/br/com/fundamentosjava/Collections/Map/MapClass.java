package br.com.fundamentosjava.Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {

        Map<Integer,String> usuarios = new HashMap<>();

        usuarios.put(1,"Lucas");
        usuarios.put(2,"Aline");
        usuarios.put(3,"Bob");
        usuarios.put(4,"Baco");
        usuarios.put(5,"Chico");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(5));

        for (int chave: usuarios.keySet())
              {
            System.out.println(chave);
        }

        for (String valores: usuarios.values())
             {
            System.out.println(valores);
        }

            for (Map.Entry<Integer,String> res : usuarios.entrySet()){
                System.out.println(res.getKey());
                System.out.println(res.getValue());
            }
    }
}
