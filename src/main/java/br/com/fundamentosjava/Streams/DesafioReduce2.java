package br.com.fundamentosjava.Streams;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DesafioReduce2 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Lucas",7.4);
        Aluno a2 = new Aluno("Aline",6.0);
        Aluno a3 = new Aluno("Bob",8.7);
        Aluno a4 = new Aluno("Bacon",9.6);
        Aluno a5 = new Aluno("Jose",5.4);


        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);


        alunos.stream()
                .filter(a -> a.nota > 7.0)
                .map(a -> a.nota)
                .reduce((a,b) -> a + b)
                .ifPresent(System.out::println);
    }
}
