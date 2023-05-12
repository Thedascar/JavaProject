package br.com.fundamentosjava.Collections.EqualseHash;

public class Usuario {
    String nome;
    String email;

    Usuario(String nomeUsuario,String emailUsuario) {
        this.nome = nomeUsuario;
        this.email = emailUsuario;
    }

    @Override
    public boolean equals(Object obj) {
        Usuario outro = (Usuario) obj;

        if(outro instanceof Usuario){
            boolean nomeIgual = outro.nome == this.nome;
            boolean emailIgual = outro.email == this.email;
            return nomeIgual && emailIgual;
        }else{
            return false;
        }
    }
}
