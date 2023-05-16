package br.com.fundamentosjava.JavaOOP.Composicao.MuitosParaMuitos;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Lucas");
        Aluno aluno2 = new Aluno("Aline");
        Aluno aluno3 = new Aluno("Bob");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("JavaScript");
        Curso curso3 = new Curso("Golang");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for(Aluno aluno: curso3.alunos){
            System.out.println("Estou matriculado no curso "+
                    curso3.nome + ".....");
            System.out.println("... e o meu nome é " + aluno.nome);
            System.out.println();
        }

        System.out.println(aluno1.cursos.get(2).alunos);

        Curso encontrado = aluno1.obterCursoPorNome("java");
        if(encontrado != null){
            System.out.println(encontrado.nome);
            System.out.println(encontrado.alunos);
        }
    }
}
