package br.com.BaseJava.JavaOOP.Polimorfismo;

public abstract class Comida {
    private static double peso;

    public Comida(double peso){
        setPeso(peso);
    }

    public static double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso > 0){
            Comida.peso = peso;
        }
    }
}
