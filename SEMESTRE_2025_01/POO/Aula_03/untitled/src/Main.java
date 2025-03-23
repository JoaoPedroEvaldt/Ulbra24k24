import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        List<Double> numeros = List.of(10.0, 2.0, 3.0);

        // Realizando operações
        calculadora.setOperacao(new Soma());
        System.out.println("Soma: " + calculadora.calcular(numeros));

        calculadora.setOperacao(new Subtracao());
        System.out.println("Subtração: " + calculadora.calcular(numeros));

        calculadora.setOperacao(new Multiplicacao());
        System.out.println("Multiplicação: " + calculadora.calcular(numeros));

        calculadora.setOperacao(new Divisao());
        System.out.println("Divisão: " + calculadora.calcular(numeros));
    }
}
