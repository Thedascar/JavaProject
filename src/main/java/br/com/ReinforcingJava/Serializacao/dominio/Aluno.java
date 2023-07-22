package br.com.ReinforcingJava.Serializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {


    @Serial // geração automatica de id
    private static final long serialVersionUID = -2540939974529056450L;

    private Long id;
    private transient Turma turma;
    private  String nome;
    private transient String password; // usamos essa notação para tirar o password

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                "turma" + turma + ""+
                '}';
    }


    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Serial
    private void writeObject(ObjectInputStream os) {
        try {
            os.defaultReadObject();
            String nomeTurma = os.readUTF();
            turma = new Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }




    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
