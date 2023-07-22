package br.com.ReinforcingJava.OOP.test.muitosparaum;

import br.com.ReinforcingJava.OOP.domain.manytomany.Avatar;
import br.com.ReinforcingJava.OOP.domain.manytomany.Player;

import java.util.ArrayList;
import java.util.List;

public class muitosParaUm {
    public static void main(String[] args) {

        Avatar a = new Avatar("Thedascar");
        Avatar b = new Avatar("Lord Paulistinha");
        Avatar c = new Avatar("Matheus Dragon Wielki");

        List<Avatar> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        Player p = new Player("Lucas",list);

        p.printer();

    }
}
