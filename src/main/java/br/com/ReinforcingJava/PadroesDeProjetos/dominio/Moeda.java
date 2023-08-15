package br.com.ReinforcingJava.PadroesDeProjetos.dominio;

public interface Moeda {
    String simbolo();

}

class Real implements Moeda{

    @Override
    public String simbolo() {
        return "R$";
    }
}

class Dollar implements Moeda{

    @Override
    public String simbolo() {
        return "$";
    }
}
