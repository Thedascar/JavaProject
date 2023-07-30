package br.com.ReinforcingJava.Generics.dominio;

public class Aviao {
    private String nome;

    public Aviao(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
