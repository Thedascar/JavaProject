package br.com.ReinforcingJava.Collections.teste;

import br.com.ReinforcingJava.Collections.dominio.Dogs;

import java.util.*;

public class SetTeste01 {
    public static void main(String[] args) {
        Set<Dogs> dogs = new LinkedHashSet<>();
        dogs.add(new Dogs(5L,"Dog",6));
        dogs.add(new Dogs(3L,"Bacon",3));
        dogs.add(new Dogs(1L,"Nego",4));
        dogs.add(new Dogs(2L,"Zeze",0));
        dogs.add(new Dogs(4L,"Abuba",5));
        dogs.add(new Dogs(4L,"Abuba",5));


        for (Dogs dog : dogs) {
            System.out.println(dog);
        }

    }
}
