package br.com.ReinforcingJava.OOP.test.umparaum;

import br.com.ReinforcingJava.OOP.domain.onetoone.Avatar;
import br.com.ReinforcingJava.OOP.domain.onetoone.Player;

public class umParaUmTeste {
    public static void main(String[] args) {

        Player p = new Player("Lucas");
        Avatar a = new Avatar("Thedascar");

        p.setAvatar(a);
        System.out.println(p.getAvatar().getNome());
    }
}
