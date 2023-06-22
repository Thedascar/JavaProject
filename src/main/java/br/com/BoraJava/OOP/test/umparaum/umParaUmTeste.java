package br.com.BoraJava.OOP.test.umparaum;

import br.com.BoraJava.OOP.domain.onetoone.Avatar;
import br.com.BoraJava.OOP.domain.onetoone.Player;

public class umParaUmTeste {
    public static void main(String[] args) {

        Player p = new Player("Lucas");
        Avatar a = new Avatar("Thedascar");

        p.setAvatar(a);
        System.out.println(p.getAvatar().getNome());
    }
}
