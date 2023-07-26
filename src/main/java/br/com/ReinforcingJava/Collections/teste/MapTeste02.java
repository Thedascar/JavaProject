package br.com.ReinforcingJava.Collections.teste;

import br.com.ReinforcingJava.Collections.dominio.Consumidor;
import br.com.ReinforcingJava.Collections.dominio.Dogs;

import java.util.HashMap;
import java.util.Map;

public class MapTeste02 {
    public static void main(String[] args) {

        Dogs a = new Dogs(5L,"Dog");
        Dogs b = new Dogs(3L,"Bacon");
        Dogs c = new Dogs(1L,"Nego");
        Dogs d = new Dogs(2L,"Zeze");
        Dogs e = new Dogs(4L,"Abuba");


        Consumidor consumidor1 = new Consumidor("Lucas");
        Consumidor consumidor2 = new Consumidor("Aline");


        Map<Consumidor,Dogs> list = new HashMap<>();
        list.put(consumidor1,e);
        list.put(consumidor2,b);


        for(Map.Entry<Consumidor,Dogs> entry : list.entrySet()){
            System.out.println(entry.getKey().getNome()+ " -> " + entry.getValue().getNomeDog());
        }
    }
}
