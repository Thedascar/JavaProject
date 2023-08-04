package br.com.ReinforcingJava.Opcional.teste;

import java.util.List;
import java.util.Optional;

public class OpcionalTeste01 {
    public static void main(String[] args) {

        Optional<String> num = Optional.of("aaaa");
        Optional<String> num2 = Optional.ofNullable(null);
        Optional<String> num3 = Optional.empty();
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println("--------------------");

        Optional<String> findNoome = findNmae("Aline");
        String a = findNoome.orElse("não tem");
        System.out.println(a);
        findNoome.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findNmae(String name){
        List<String> list2 = List.of("Lucas", "Aline", "Baby");
        int i  = list2.indexOf(name);
        if(i != -1){
            return  Optional.of(list2.get(i));
        }
        return Optional.empty();
    }
}
