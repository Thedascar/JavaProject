package br.com.BoraJava.OOP.domain.relationship;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private String especialidade;
    List<Seminario> seminarios = new ArrayList<>();

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void getSeminarios() {
        for(Seminario a : seminarios){
            System.out.println(a.getTitulo());
        }
    }

    public void setSeminarios(Seminario seminario) {
        this.seminarios.add(seminario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
