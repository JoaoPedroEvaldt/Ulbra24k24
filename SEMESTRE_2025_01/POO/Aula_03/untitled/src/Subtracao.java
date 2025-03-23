import java.util.List;

public class Subtracao implements OperacaoMatematica {
    public double calcular(List<Double> numeros) {
        return numeros.stream().reduce((a, b) -> a - b).orElse(0.0);
    }
}
