package br.com.BaseJava.Observer.Obs01;

import java.util.Date;

public class ChegadaAniversarianteEvent {

    private final Date horadaChegada;

    public ChegadaAniversarianteEvent(Date horadaChegada) {
        this.horadaChegada = horadaChegada;
    }

    public Date getHoradaChegada() {
        return horadaChegada;
    }
}
