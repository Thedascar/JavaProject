package br.com.fundamentosjava.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Lucas",7.4);
        Aluno a2 = new Aluno("Aline",5.8);
        Aluno a3 = new Aluno("Bob",8.7);
        Aluno a4 = new Aluno("Bacon",9.6);
        Aluno a5 = new Aluno("Jose",4.4);


        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);

        Predicate<Aluno> aprovados = a -> a.nota >= 7.0;
        Predicate<Aluno> reprovado = aprovados.negate();

        System.out.println(alunos.stream().allMatch(aprovados));
        System.out.println(alunos.stream().anyMatch(aprovados));
        System.out.println(alunos.stream().noneMatch(reprovado));
    }
}
