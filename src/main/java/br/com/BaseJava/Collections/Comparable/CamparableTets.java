package br.com.BaseJava.Collections.Comparable;

import java.util.TreeSet;

public class CamparableTets {

    public static void main(String[] args) {

        TreeSet<Integer> num = new TreeSet<>();

        num.add(10);
        num.add(1);
        num.add(2);
        num.add(6);
        num.add(8);
        num.add(9);
        num.add(123);
        num.add(-13);

        for (Integer n:
                num
             ) {
            System.out.println(n);
        }
    }
}
