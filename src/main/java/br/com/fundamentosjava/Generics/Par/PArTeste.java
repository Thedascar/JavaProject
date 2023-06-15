package br.com.fundamentosjava.Generics.Par;

public class PArTeste {
    public static void main(String[] args) {
        Pares<Integer,String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1,"Lucas");
        resultadoConcurso.adicionar(2,"Bacon");
        resultadoConcurso.adicionar(3,"Aline");
        resultadoConcurso.adicionar(4,"Bob");
        resultadoConcurso.adicionar(2,"Jose");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(2));
        System.out.println(resultadoConcurso.getValor(3));    }


}
