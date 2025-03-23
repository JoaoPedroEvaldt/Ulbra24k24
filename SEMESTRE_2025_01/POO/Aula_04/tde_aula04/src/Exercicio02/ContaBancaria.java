package Exercicio02;

class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(ContaBancaria destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}
