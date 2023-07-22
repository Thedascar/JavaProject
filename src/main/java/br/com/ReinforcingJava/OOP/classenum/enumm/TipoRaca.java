package br.com.ReinforcingJava.OOP.classenum.enumm;

public enum TipoRaca {
    VIRA_LATA(1),
    LHASA(2);

    private final int valor;

    TipoRaca(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
