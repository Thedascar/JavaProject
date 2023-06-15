package br.com.fundamentosjava.ErrosExecoes;

public class StringvaziaException extends RuntimeException{

    private String nomeDoAtributo;

    public StringvaziaException(String nomeDOAtributo){
        this.nomeDoAtributo = nomeDOAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s está Vazio",nomeDoAtributo);
    }

}
