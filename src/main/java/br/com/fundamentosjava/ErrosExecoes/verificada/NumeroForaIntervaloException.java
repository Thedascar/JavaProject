package br.com.fundamentosjava.ErrosExecoes.verificada;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception{

    private String nomeDoAtributo;

    public NumeroForaIntervaloException(String nomeDOAtributo){
        this.nomeDoAtributo = nomeDOAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s está Fora do Intervalo",nomeDoAtributo);
    }

}
