package Exercicio04;

class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        if (senha.length() < 6) {
            throw new IllegalArgumentException("A senha deve ter pelo menos 6 caracteres.");
        }
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
}