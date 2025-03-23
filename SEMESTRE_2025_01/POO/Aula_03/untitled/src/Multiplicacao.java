import java.util.List;

public class Multiplicacao implements OperacaoMatematica {
    public double calcular(List<Double> numeros) {
        return numeros.stream().reduce((a, b) -> a * b).orElse(1.0);
    }
}
