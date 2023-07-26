package br.com.ReinforcingJava.Collections.dominio;

import java.util.Objects;

public class Dogs implements Comparable<Dogs> {
    private Long id;
    private String nomeDog;
    private int quantidade;

    @Override
    public int compareTo(Dogs o) {

        return this.id.compareTo(o.getId());
    }


    public Dogs(Long id, String nomeDog, int quantidade) {
        this(id,nomeDog);
        this.quantidade = quantidade;
    }

    public Dogs(Long id, String nomeDog) {
        this.id = id;
        this.nomeDog = nomeDog;
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "id=" + id +
                ", nomeDog='" + nomeDog + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dogs dogs = (Dogs) o;
        return Objects.equals(id, dogs.id) && Objects.equals(nomeDog, dogs.nomeDog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeDog);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDog() {
        return nomeDog;
    }

    public void setNomeDog(String nomeDog) {
        this.nomeDog = nomeDog;
    }
}
