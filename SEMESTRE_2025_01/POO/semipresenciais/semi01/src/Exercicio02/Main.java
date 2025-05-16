package Exercicio02;

public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("Toyota", "Corolla", 2020);
        Veiculo carro2 = new Veiculo("Honda", "Civic", 2022);

        carro1.ligar();
        carro1.desligar();

        carro2.ligar();
        carro2.desligar();
    }
}
