package Exercicio03;

public abstract class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo de " + titular + ": R$ " + saldo);
    }
}
