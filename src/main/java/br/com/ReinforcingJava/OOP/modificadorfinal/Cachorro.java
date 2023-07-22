package br.com.ReinforcingJava.OOP.modificadorfinal;

public final class Cachorro {
    private final String NOME_DO_DOG = "Bob";
    public final Dono DONO = new Dono();

    public String getNome() {
        return NOME_DO_DOG;
    }

    public final void lata(){
        System.out.println("auAUauAUauAU");
    }
}
