package br.com.ReinforcingJava.OOP.test;

import br.com.ReinforcingJava.OOP.domain.PessoaStatic;

import java.util.ArrayList;
import java.util.List;

public class TestePessoaStatic {
    public static void main(String[] args) {
        PessoaStatic p1 = new PessoaStatic("Lucas",28);
        PessoaStatic p2 = new PessoaStatic("Aline",26);
        PessoaStatic p3 = new PessoaStatic("Bob",9);
        PessoaStatic p4 = new PessoaStatic("Bacon",4);


        List<PessoaStatic> pessoa = new ArrayList<>();
        pessoa.add(p1);
        pessoa.add(p2);
        pessoa.add(p3);
        pessoa.add(p4);
        pessoa.stream().forEach(e -> System.out.println(e.getNome()));

        PessoaStatic.mostraCpf();
        PessoaStatic.getCount();
    }
}
