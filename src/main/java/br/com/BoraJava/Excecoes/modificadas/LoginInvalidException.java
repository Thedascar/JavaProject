package br.com.BoraJava.Excecoes.modificadas;

public class LoginInvalidException extends Exception {

    public LoginInvalidException(){
        super("Login Inválido");
    }

    public LoginInvalidException(String message){
        super(message);
    }

}

