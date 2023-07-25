package br.com.ReinforcingJava.Collections.teste;

import br.com.ReinforcingJava.Collections.dominio.Dogs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DogByIIdComparator implements Comparator<Dogs>{

    @Override
    public int compare(Dogs o1, Dogs o2) {
        return o1.getId().compareTo(o2.getId());
    }
}


public class DogsSortedTeste01 {
    public static void main(String[] args) {
        List<Dogs> dogs = new ArrayList<>();

        dogs.add(new Dogs(5L,"Dog"));
        dogs.add(new Dogs(3L,"Bacon"));
        dogs.add(new Dogs(1L,"Nego"));
        dogs.add(new Dogs(2L,"Zeze"));
        dogs.add(new Dogs(4L,"Abuba"));


        for (Dogs dog : dogs) {
            System.out.println(dog);
        }


        System.out.println("-----------------");
        Collections.sort(dogs);

        for (Dogs dog : dogs) {
            System.out.println(dog);
        }

        System.out.println("-----------------");
        dogs.sort(new DogByIIdComparator());
        for (Dogs dog : dogs) {
            System.out.println(dog);
        }


    }
}
