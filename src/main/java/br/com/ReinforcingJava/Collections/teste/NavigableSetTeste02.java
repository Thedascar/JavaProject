package br.com.ReinforcingJava.Collections.teste;

import br.com.ReinforcingJava.Collections.dominio.Dogs;
import br.com.ReinforcingJava.Collections.dominio.SmartPhone;


import java.util.*;


class SmartComparator implements Comparator<SmartPhone>{
    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTeste02 {
    public static void main(String[] args) {
        NavigableSet<SmartPhone> smart  = new TreeSet<>(new SmartComparator());
        SmartPhone smartPhone1 = new SmartPhone("4958AWX","IPhone");
        SmartPhone smartPhone2 = new SmartPhone("9587FJD","Samsung");
        SmartPhone smartPhone3 = new SmartPhone("65957WE","LG");
        smart.add(smartPhone1);
        smart.add(smartPhone2);
        smart.add(smartPhone3);
        smart.add(smartPhone3);

        for (SmartPhone smartPhone : smart) {
            System.out.println(smartPhone);
        }

        NavigableSet<Dogs> dogs = new TreeSet<>();
        dogs.add(new Dogs(5L,"Dog",6));
        dogs.add(new Dogs(3L,"Bacon",3));
        dogs.add(new Dogs(1L,"Nego",4));
        dogs.add(new Dogs(2L,"Zeze",0));
        dogs.add(new Dogs(4L,"Abuba",5));
        dogs.add(new Dogs(4L,"Abuba",5));
        dogs.add(new Dogs(5L,"Abuba",5));


        for (Dogs dog : dogs) {
            System.out.println(dog);
        }

        System.out.println("---------------------");
        Dogs a = new Dogs(2L,"asaqda",3);

        System.out.println(dogs.lower(a));
        System.out.println(dogs.floor(a));
        System.out.println(dogs.higher(a));
        System.out.println(dogs.ceiling(a));

        System.out.println("------------------");
        System.out.println(dogs.size());
        System.out.println(dogs.pollLast());
        System.out.println(dogs.pollFirst());
    }
}
