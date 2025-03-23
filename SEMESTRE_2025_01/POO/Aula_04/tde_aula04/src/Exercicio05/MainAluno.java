package Exercicio05;

class MainAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas");
        aluno.adicionarCurso(new Curso("Java"));
        aluno.listarCursos();
    }
}