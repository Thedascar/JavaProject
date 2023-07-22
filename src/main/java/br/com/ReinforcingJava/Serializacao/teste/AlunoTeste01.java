package br.com.ReinforcingJava.Serializacao.teste;

import br.com.ReinforcingJava.Serializacao.dominio.Aluno;
import br.com.ReinforcingJava.Serializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AlunoTeste01 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(1L, "Lucas", "123456789");
        Turma turma = new Turma("turma nova");
        aluno.setTurma(turma);
        //serializar(aluno);
        deserializar();

    }

    private static void serializar(Aluno aluno) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("pasta/aluno.ser")))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void deserializar() {
        try (ObjectInputStream oo = new ObjectInputStream(Files.newInputStream(Paths.get("pasta/aluno.ser")))) {
            Aluno aluno = (Aluno) oo.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
