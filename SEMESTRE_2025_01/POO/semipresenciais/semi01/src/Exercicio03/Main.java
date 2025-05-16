package Exercicio03;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("João");
        ContaPoupanca conta2 = new ContaPoupanca("Maria");
        ContaSalario conta3 = new ContaSalario("Carlos");

        conta1.depositar(500);
        conta1.consultarSaldo();

        conta1.transferir(conta2, 200);
        conta1.consultarSaldo();
        conta2.consultarSaldo();

        conta2.sacar(50);
        conta2.consultarSaldo();

        conta3.depositar(1000);
        conta3.consultarSaldo();
    }
}
