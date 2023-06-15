package br.com.fundamentosjava.ErrosExecoes;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException{

    private String nomeDoAtributo;

    public NumeroForaIntervaloException(String nomeDOAtributo){
        this.nomeDoAtributo = nomeDOAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s está Fora do Intervalo",nomeDoAtributo);
    }

}
