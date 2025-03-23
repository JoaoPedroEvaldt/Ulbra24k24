import java.util.List;

public class Calculadora {
    private OperacaoMatematica operacao;

    // Método para definir a operação desejada
    public void setOperacao(OperacaoMatematica operacao) {
        this.operacao = operacao;
    }

    // Método que executa a operação e retorna o resultado
    public double calcular(List<Double> numeros) {
        if (operacao == null) {
            throw new IllegalStateException("Nenhuma operação foi definida!");
        }
        return operacao.calcular(numeros);
    }
}
