package br.com.BoraJava.OOP.domain.muitosparaum;

import java.util.List;

public class Player {
    private String nome;
    private List<Avatar> avatar;

    public Player(String nome, List<Avatar> avatar) {
        this.nome = nome;
        this.avatar = avatar;
    }

    public void printer(){
        for (Avatar a : avatar){
            System.out.println(a.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Avatar> getAvatar() {
        return avatar;
    }

    public void setAvatar(List<Avatar> avatar) {
        this.avatar = avatar;
    }
}
