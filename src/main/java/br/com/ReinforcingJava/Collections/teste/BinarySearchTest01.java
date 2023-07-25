package br.com.ReinforcingJava.Collections.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(6);
        num.add(4);
        num.add(3);
        num.add(5);
        num.add(1);
        num.add(2);

        // (-(ponto de inserção)-1)
        Collections.sort(num);
        System.out.println(num);
        System.out.println(Collections.binarySearch(num,7));
    }
}
