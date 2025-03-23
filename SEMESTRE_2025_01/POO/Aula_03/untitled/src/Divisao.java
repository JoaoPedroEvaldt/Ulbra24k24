import java.util.List;

public class Divisao implements OperacaoMatematica {
    public double calcular(List<Double> numeros) {
        return numeros.stream().reduce((a, b) -> b != 0 ? a / b : a).orElse(1.0);
    }
}
