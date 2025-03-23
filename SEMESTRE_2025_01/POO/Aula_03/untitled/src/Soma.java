import java.util.List;

public class Soma implements OperacaoMatematica {
    public double calcular(List<Double> numeros) {
        return numeros.stream().mapToDouble(Double::doubleValue).sum();
    }
}
