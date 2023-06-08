package br.com.fundamentosjava.JPAHIBERNATE.Basico;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.NaturalId;


@Entity
public class Usuario {

    @NaturalId
    private Long id;

    private String nome;

    private String email;

    public Usuario(){

    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
