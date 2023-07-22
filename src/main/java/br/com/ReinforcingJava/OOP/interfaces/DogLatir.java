package br.com.ReinforcingJava.OOP.interfaces;

public interface DogLatir {

    public abstract void latir();

    // método default permite fazer um método sem que a class
    // seja obrigada a ter o método também
    default void naoprecisa(){
        System.out.println("Essa não precisa implementar");
    }

    public static void doglatir(){
        System.out.println("Metodo static de dentro de doglatir");
    }
}
