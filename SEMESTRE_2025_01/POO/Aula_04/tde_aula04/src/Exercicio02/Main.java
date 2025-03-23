package Exercicio02;

class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Renata", 1000);
        conta1.depositar(200);
        conta1.sacar(100);
    }
}