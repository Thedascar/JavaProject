package br.com.ReinforcingJava.OOP.domain.relationship;

import java.util.ArrayList;
import java.util.List;

public class Seminario {
    private String titulo;
    private Local local;
    private Professor professor;
    private List<Aluno> aluno1 = new ArrayList<>();

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public void imprime(){
        System.out.println("---------------------");
        System.out.println("Seminario: " + titulo);
        System.out.println("Local: " + local.getEndereco());
        System.out.println("Alunos: ");
        for (Aluno aluno : aluno1) {
            System.out.println(aluno.getNome() + " ");
        }
        System.out.println("Professore: " + getProfessor().getNome());
        System.out.println("-------------------------");

    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void getAluno() {
        for(Aluno a : aluno1){
            System.out.println(a.getNome());
        }

    }

    public void setAluno(Aluno aluno1) {

        this.aluno1.add(aluno1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAluno1() {
        return aluno1;
    }

    public void setAluno1(List<Aluno> aluno1) {
        this.aluno1 = aluno1;
    }
}
