package Exercicio03;

class MainFuncionario {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Carlos", 5000);
        System.out.println("Bônus do Gerente: " + gerente.calcularBonus());
    }
}