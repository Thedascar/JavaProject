package br.com.fundamentosjava.ErrosExecoes;
import br.com.fundamentosjava.Streams.Aluno;

public class TesteValidacoes {
    public static void main(String[] args){
        try {
            Aluno aluno2 = new Aluno("AA",-7);
            Validar.usuario(aluno2);
        }catch (StringvaziaException | NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("a");
    }
}
