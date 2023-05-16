package br.com.fundamentosjava.JavaOOP.Polimorfismo;

public class Comida {
    private static double peso;

    public Comida(double peso){
        setPeso(peso);
    }

    public static double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso > 0){
            this.peso = peso;
        }
    }
}
