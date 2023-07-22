package br.com.BaseJava.Collections.EqualseHash;

import java.util.Objects;

public class Usuario {
    String nome;

    Usuario(String nomeUsuario) {
        this.nome = nomeUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return nome.equals(usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
