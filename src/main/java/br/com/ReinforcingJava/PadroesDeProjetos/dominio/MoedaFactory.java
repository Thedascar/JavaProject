package br.com.ReinforcingJava.PadroesDeProjetos.dominio;

public class MoedaFactory {
    public static Moeda novaMoeda(Pais pais){
        switch (pais){
            case BRAZIL:return new Real();
            case EUA:return  new Dollar();
            default:throw new IllegalArgumentException("Nada");
        }
    }

}
