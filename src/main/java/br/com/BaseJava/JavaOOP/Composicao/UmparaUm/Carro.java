package br.com.BaseJava.JavaOOP.Composicao.UmparaUm;

public class Carro {
    final Motor motor;

    Carro(){
        this.motor = new Motor(this);
    }


    void acelerar(){
        if(motor.fatorInjecao < 2.6){
            motor.fatorInjecao += 0.4;
        }
    }

    void frear(){
        if(motor.fatorInjecao > 0.5){
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligado(){
        motor.ligado = true;
    }

    void desligado(){
        motor.ligado = false;
    }

    boolean estaLiagado(){
        return motor.ligado;
    }

}
