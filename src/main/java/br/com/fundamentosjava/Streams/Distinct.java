package br.com.fundamentosjava.Streams;
import java.util.Arrays;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Lucas", 7.4);
        Aluno a2 = new Aluno("Aline", 5.8);
        Aluno a3 = new Aluno("Bob", 8.7);
        Aluno a4 = new Aluno("Bacon", 9.6);
        Aluno a5 = new Aluno("Jose", 4.4);
        Aluno a6 = new Aluno("Lucas", 7.4);
        Aluno a7 = new Aluno("Aline", 5.8);
        Aluno a8 = new Aluno("Joao", 8.7);


        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("Distinct...");
        alunos.stream().distinct().forEach(System.out::println);


        System.out.println("takeWHile");
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >= 8)
                .forEach(System.out::println);

        System.out.println("Skip/Limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);
    }
}
