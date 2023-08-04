package br.com.ReinforcingJava.Opcional.dominio;

public class MangaOpctional {
    private Integer id;
    private String titulo;
    private int capitulos;

    public MangaOpctional(Integer id, String titulo, int capitulos) {
        this.id = id;
        this.titulo = titulo;
        this.capitulos = capitulos;
    }


    @Override
    public String toString() {
        return "MangaOpctional{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", capitulos=" + capitulos +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }
}
