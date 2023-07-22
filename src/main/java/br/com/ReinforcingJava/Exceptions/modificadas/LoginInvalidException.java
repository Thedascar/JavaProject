package br.com.ReinforcingJava.Exceptions.modificadas;

public class LoginInvalidException extends Exception {

    public LoginInvalidException(){
        super("Login Inválido");
    }

    public LoginInvalidException(String message){
        super(message);
    }

}

