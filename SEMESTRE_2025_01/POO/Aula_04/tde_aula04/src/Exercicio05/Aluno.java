package Exercicio05;

class Aluno {
    private String nome;
    private List<Curso> cursos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println("Curso: " + curso.getNome());
        }
    }
}