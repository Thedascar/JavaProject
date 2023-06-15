package br.com.fundamentosjava.Collections.Set;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoSet {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add("Lucas");
        conjunto.add(true);
        conjunto.add(2);

        System.out.println(conjunto.size());

        conjunto.add(1.2);
        conjunto.add("lucas");
        System.out.println(conjunto.size());
        conjunto.remove("lucas");
        System.out.println(conjunto.size());
        System.out.println(conjunto.contains(1.2));
        System.out.println(conjunto);

        Set numbers = new HashSet();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        //conjunto.addAll(numbers); // união entre conjuntos
        conjunto.retainAll(numbers); //
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

    }
}
