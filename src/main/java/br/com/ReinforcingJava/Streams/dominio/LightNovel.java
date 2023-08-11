package br.com.ReinforcingJava.Streams.dominio;

import java.util.Objects;

public class LightNovel {
    private String nome;
    private Double preco;
    private Category category;


    public LightNovel(String nome, Double preco, Category category) {
        this.nome = nome;
        this.preco = preco;
        this.category = category;
    }

    public LightNovel(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightNovel that = (LightNovel) o;
        return Objects.equals(nome, that.nome) && Objects.equals(preco, that.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
