package br.com.ReinforcingJava.Collections.teste;

import br.com.ReinforcingJava.Collections.dominio.Dogs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {
        List<Dogs> dogs = new ArrayList<>();

        dogs.add(new Dogs(5L,"Dog",6));
        dogs.add(new Dogs(3L,"Bacon",3));
        dogs.add(new Dogs(1L,"Nego",4));
        dogs.add(new Dogs(2L,"Zeze",0));
        dogs.add(new Dogs(4L,"Abuba",5));


        Iterator<Dogs> iterator = dogs.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getId() == 3){
                iterator.remove();
            }
        }
        System.out.println(dogs);

        System.out.println("---------------");
        dogs.removeIf(dogs1 -> dogs1.getId() == 5);
        System.out.println(dogs);
     }
}
