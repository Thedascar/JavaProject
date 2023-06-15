package br.com.fundamentosjava.ErrosExecoes.verificada;

public class StringvaziaException extends Exception{

    private String nomeDoAtributo;

    public StringvaziaException(String nomeDOAtributo){
        this.nomeDoAtributo = nomeDOAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s está Vazio",nomeDoAtributo);
    }

}
