package br.com.fundamentosjava.JavaOOP.Heranca.Enum;

public class Monstro extends Jogador{


    public boolean atacar(Jogador oponente){
        int diferencaX = Math.abs(x - oponente.x);
        int diferencaY = Math.abs(y - oponente.y);

        if(diferencaX == 0 && diferencaY == 1){
            oponente.vida -= 10;
            return true;
        } else if (diferencaX == 1 && diferencaY == 0) {
            oponente.vida -= 10;
            return true;
        }else{
            return false;
        }
    }
}
