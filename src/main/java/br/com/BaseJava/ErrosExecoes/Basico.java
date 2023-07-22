package br.com.BaseJava.ErrosExecoes;

import br.com.BaseJava.Streams.Aluno;

public class Basico {
    public static void main(String[] args) {


        Aluno a1 = null;
        try{
            imprimiAluno(a1);
        }catch (NullPointerException e){
            System.out.println("error");
        }finally {
            System.out.println("a");
        }

    }
    public static void imprimiAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}

