package br.com.BoraJava.OOP.domain;

public class Anime {
    private String name;
    private String place;
    private String lang;
    private int[] episode = new int[0];


    {
        System.out.println("New Anime has been created");
    }

    public Anime() {
        System.out.println("Constructor void");
    }

    public Anime(String nome, String place) {
        this.name = nome;
        this.place = place;
    }

    public Anime(String nome, String place, String lang,int [] episode) {
        this(nome,place);
        this.lang = lang;
        this.episode = episode;
    }

    public String getNome() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public String getLang() {
        return lang;
    }

    public int[] getEpisode() {
        return episode;
    }

    public void printer(){
        System.out.println(name);
        System.out.println(place);
        System.out.println(lang);
        System.out.println(episode.length);

    }
}
