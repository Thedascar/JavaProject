package br.com.ReinforcingJava.Comportamento.LambdasTeste.dominio;

public class Anime {
    private String titulo;
    private int episodios;

    public Anime(String titulo, int episodios) {
        this.titulo = titulo;
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "titulo='" + titulo + '\'' +
                ", quantidade=" + episodios +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEpisodios() {
        return episodios;
    }
}
