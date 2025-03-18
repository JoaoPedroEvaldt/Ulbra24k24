import java.util.ArrayList;

public class Main {
    public static void main(String[] args){


        ArrayList<Double> lista = new ArrayList();
        lista.add(20.0);
        lista.add(30.0);

        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();

        // Instanciar nosso objeto calculadora
        CalculadoraBasica calculadora = new CalculadoraBasica();

        // Operação de soma
        calculadora.calcular(soma, lista);
        // Resultado soma
        System.out.println(calculadora.getResultado());

        // Operação de subtração
        calculadora.calcular(subtracao, lista);

        // Resultado subtração
        System.out.println(calculadora.getResultado());


    }
}