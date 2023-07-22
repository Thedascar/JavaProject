package br.com.ReinforcingJava.OOP.classenum.enumm;

public class Dog {
    private String nome;
    private TipoRaca tiporaca;

    public Dog(String nome, TipoRaca tiporaca) {
        this.nome = nome;
        this.tiporaca = tiporaca;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nome = ' " + nome + '\'' +
                "TipoRaçaInt " + tiporaca.getValor() +
                ", tiporaca = " + tiporaca +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoRaca getTiporaca() {
        return tiporaca;
    }

    public void setTiporaca(TipoRaca tiporaca) {
        this.tiporaca = tiporaca;
    }
}
