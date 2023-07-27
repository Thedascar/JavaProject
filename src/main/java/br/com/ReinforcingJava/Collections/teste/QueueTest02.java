package br.com.ReinforcingJava.Collections.teste;

import br.com.ReinforcingJava.Collections.dominio.Consumidor;
import br.com.ReinforcingJava.Collections.dominio.Dogs;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


class comPare implements Comparator<Dogs>{
    @Override
    public int compare(Dogs o1, Dogs o2) {
        return o1.getNomeDog().compareTo(o2.getNomeDog());
    }
}

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Dogs> dogs = new PriorityQueue<>(new comPare());
        dogs.add(new Dogs(5L,"Dog",6));
        dogs.add(new Dogs(3L,"Bacon",3));
        dogs.add(new Dogs(1L,"Nego",4));
        dogs.add(new Dogs(2L,"Zeze",0));
        dogs.add(new Dogs(4L,"Abuba",5));



        while(!dogs.isEmpty()){
            System.out.println(dogs.poll());
        }

    }
}
