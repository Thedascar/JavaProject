package br.com.ReinforcingJava.OOP.heranca.domain;

public class Pessoa {
    protected String nome;
    protected   int idade;
    Endereco endereco;


    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void diga(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(endereco.getRua() + " " + endereco.getNumero());
        System.out.println("-----------------------------------------");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
