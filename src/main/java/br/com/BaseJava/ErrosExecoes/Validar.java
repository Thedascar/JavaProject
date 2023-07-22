package br.com.BaseJava.ErrosExecoes;

import br.com.BaseJava.Streams.Aluno;

public class Validar {

    private Validar() {}

    public static void usuario(Aluno aluno){
        if (aluno == null) {
            throw new IllegalArgumentException("o aluno está nulo");
        }
        if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringvaziaException("nome");
        }
        if (aluno.nota < 0 || aluno.nota > 10){
            throw new NumeroForaIntervaloException("nota");
        }
    }
}

