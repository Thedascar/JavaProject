package br.com.fundamentosjava.Streams;

import br.com.fundamentosjava.Streams.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Reduce3 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Lucas",7.4);
        Aluno a2 = new Aluno("Aline",6.0);
        Aluno a3 = new Aluno("Bob",8.7);
        Aluno a4 = new Aluno("Bacon",9.6);
        Aluno a5 = new Aluno("Jose",5.4);


        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);

        BiFunction<Media,Double,Media> calcMedia = (media,nota) -> media.adicionar(nota);
        BinaryOperator<Media> combinaMedia = (m1, m2) -> Media.combinar(m1,m2);


       Media media =  alunos.stream()
                .filter(a -> a.nota > 7.0)
                .map(a -> a.nota)
                .reduce(new Media(),calcMedia,combinaMedia);


        System.out.println("Á média dos aprovados é " + media.getValor());

    }
}
