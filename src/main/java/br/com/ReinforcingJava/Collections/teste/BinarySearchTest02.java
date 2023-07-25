package br.com.ReinforcingJava.Collections.teste;

import br.com.ReinforcingJava.Collections.dominio.Dogs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Dogs> dogs = new ArrayList<>();

        dogs.add(new Dogs(5L,"Dog"));
        dogs.add(new Dogs(3L,"Bacon"));
        dogs.add(new Dogs(1L,"Nego"));
        dogs.add(new Dogs(2L,"Zeze"));
        dogs.add(new Dogs(4L,"Abuba"));

        Collections.sort(dogs);

        for (Dogs dog : dogs) {
            System.out.println(dog);
        }
        Dogs a = new Dogs(4L,"Abuba");

        System.out.println(Collections.binarySearch(dogs,a));



    }
}
