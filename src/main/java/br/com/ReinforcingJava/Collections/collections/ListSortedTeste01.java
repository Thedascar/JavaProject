package br.com.ReinforcingJava.Collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortedTeste01 {
    public static void main(String[] args) {

        List<String> dogs = new ArrayList<>();

        dogs.add("Dog");
        dogs.add("Bacon");
        dogs.add("Nego");
        dogs.add("Zeze");
        dogs.add("Abuba");

        Collections.sort(dogs);

        for (String dog : dogs) {
            System.out.println(dog);
        }




    }
}
