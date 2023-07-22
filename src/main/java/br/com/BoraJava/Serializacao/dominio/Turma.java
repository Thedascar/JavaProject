package br.com.BoraJava.Serializacao.dominio;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serial;

public class Turma {
    private String nome;

    public Turma(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
