package br.com.ReinforcingJava.Collections.dominio;

import java.util.Objects;

public class Dogs {
    private Long id;
    private String nomeDog;

    public Dogs(Long id, String nomeDog) {
        this.id = id;
        this.nomeDog = nomeDog;
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "id=" + id +
                ", nomeDog='" + nomeDog + '\'' +
                '}';
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
