package br.com.BaseJava.JavaOOP.Heranca.Teste;

import br.com.BaseJava.JavaOOP.Heranca.Enum.Direcao;
import br.com.BaseJava.JavaOOP.Heranca.Enum.Heroi;
import br.com.BaseJava.JavaOOP.Heranca.Enum.Monstro;

public class Jogo {
    public static void main(String[] args) {


        Monstro mostro = new Monstro();
        mostro.x = 10;
        mostro.y = 10;
        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;

        System.out.println("Mostro -> " + mostro.vida);
        System.out.println("Heroi -> " + heroi.vida);

        mostro.atacar(heroi);
        heroi.atacar(mostro);

        mostro.andar(Direcao.NORTE);

        System.out.println("Mostro -> " + mostro.vida);
        System.out.println("Heroi -> " + heroi.vida);

    }
}
