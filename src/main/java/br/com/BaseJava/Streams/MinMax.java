package br.com.BaseJava.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Lucas",7.4);
        Aluno a2 = new Aluno("Aline",5.8);
        Aluno a3 = new Aluno("Bob",8.7);
        Aluno a4 = new Aluno("Bacon",9.6);
        Aluno a5 = new Aluno("Jose",4.4);


        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);

        Comparator<Aluno> melhorNota = (aluno1 ,aluno2) -> {
            if (aluno1.nota > aluno2.nota) return 1;
            if (aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
    }
}
