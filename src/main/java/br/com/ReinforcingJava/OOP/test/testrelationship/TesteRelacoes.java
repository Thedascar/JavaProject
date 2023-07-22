package br.com.ReinforcingJava.OOP.test.testrelationship;

import br.com.ReinforcingJava.OOP.domain.relationship.Aluno;
import br.com.ReinforcingJava.OOP.domain.relationship.Local;
import br.com.ReinforcingJava.OOP.domain.relationship.Professor;
import br.com.ReinforcingJava.OOP.domain.relationship.Seminario;

public class TesteRelacoes {
    public static void main(String[] args) {

        Local local = new Local("Estrada Dos Guararapes");


        Aluno a1 = new Aluno("Lucas",28);
        Aluno a2 = new Aluno("Aline",26);
        Aluno a3 = new Aluno("Bacon",18);
        Aluno a4 = new Aluno("Bob",23);
        Aluno a5 = new Aluno("Manoela",83);

        Professor professorJuca = new Professor("Juca","backend");
        Professor professorJose = new Professor("Jose","web");

        Seminario java = new Seminario("Java",local);
        Seminario springboot = new Seminario("SpringBoot",local);
        Seminario sql = new Seminario("Sql",local);

        a1.setSeminario(java);
        a3.setSeminario(java);
        a2.setSeminario(springboot);
        a4.setSeminario(springboot);
        a5.setSeminario(sql);
        java.setAluno(a1);
        java.setAluno(a3);
        java.setProfessor(professorJuca);
        springboot.setAluno(a2);
        springboot.setProfessor(professorJuca);
        springboot.setAluno(a4);
        sql.setAluno(a5);
        sql.setProfessor(professorJose);
        professorJuca.setSeminarios(java);
        professorJuca.setSeminarios(springboot);
        professorJose.setSeminarios(sql);

        java.imprime();
        springboot.imprime();
        sql.imprime();













    }
}
