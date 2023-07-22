package br.com.ReinforcingJava.Exceptions.modificadas;

public class TesteInvalidTeste {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidException {
        String user = "root";
        String senh = "123";
        String usernameDb = "root";
        String senhaDb = "123";
        if(!usernameDb.equals(user) || !senhaDb.equals(senh)){
                throw new LoginInvalidException();

        }
        System.out.println("Usuario logado");
    }

}
