import java.util.ArrayList;

//Abstract quer dizer que ela não pode ser instaciada a partir dessa classe
//Assim que classe for extendida, vai herdar este resultado
abstract public class Calculadora {

    private double resultado;

    abstract void calcular(Operador operador, ArrayList<Double> lista);

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}