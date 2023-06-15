package br.com.fundamentosjava.Observer.Obs01;

public class Namorada implements ChegadaAniversarianteObserver {

    @Override
    public void chegou(ChegadaAniversarianteEvent event) {
        System.out.println("Apagar as luzes");
        System.out.println("Silencio");
        System.out.println("Surpresa");
    }
}
