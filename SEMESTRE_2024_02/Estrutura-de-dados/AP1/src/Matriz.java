import java.util.Scanner;
import java.util.Random;

public class Matriz {
    private int[][] matriz;


    public Matriz(int linhas, int colunas) {
        matriz = new int[linhas][colunas];
    }


    public void preencherManual() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }


    public void preencherAleatorio() {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100); // Valores de 0 a 99
            }
        }
    }


    public void inserirElemento(int linha, int coluna, int valor) {
        if (linha >= 0 && linha < matriz.length && coluna >= 0 && coluna < matriz[linha].length) {
            matriz[linha][coluna] = valor;
        } else {
            System.out.println("Posição inválida.");
        }
    }


    public void removerElemento(int linha, int coluna) {
        if (linha >= 0 && linha < matriz.length && coluna >= 0 && coluna < matriz[linha].length) {
            matriz[linha][coluna] = 0;
        } else {
            System.out.println("Posição inválida.");
        }
    }


    public void exibirMatriz() {
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
