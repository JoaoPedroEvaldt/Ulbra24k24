
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matriz matriz = new Matriz(4, 4); // Criando uma matriz 4x4
        matriz.preencherAleatorio();
        System.out.println("Matriz original:");
        matriz.exibirMatriz();

        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Ordenar linhas com Bubble Sort");
        System.out.println("2 - Ordenar colunas com Bubble Sort");
        System.out.println("3 - Ordenar linhas com Merge Sort");
        System.out.println("4 - Ordenar colunas com Merge Sort");
        System.out.println("5 - Ordenar matriz completa como vetor com Merge Sort");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Escolha a linha (0-3) para ordenar:");
                int linha = scanner.nextInt();
                matriz.ordenarLinhaBubble(linha);
                System.out.println("Matriz após ordenar a linha " + linha + " com Bubble Sort:");
                matriz.exibirMatriz();
                break;

            case 2:
                System.out.println("Escolha a coluna (0-3) para ordenar:");
                int coluna = scanner.nextInt();
                matriz.ordenarColunaBubble(coluna);
                System.out.println("Matriz após ordenar a coluna " + coluna + " com Bubble Sort:");
                matriz.exibirMatriz();
                break;

            case 3:
                System.out.println("Escolha a linha (0-3) para ordenar:");
                linha = scanner.nextInt();
                matriz.ordenarLinhaMerge(linha);
                System.out.println("Matriz após ordenar a linha " + linha + " com Merge Sort:");
                matriz.exibirMatriz();
                break;

            case 4:
                System.out.println("Escolha a coluna (0-3) para ordenar:");
                coluna = scanner.nextInt();
                matriz.ordenarColunaMerge(coluna);
                System.out.println("Matriz após ordenar a coluna " + coluna + " com Merge Sort:");
                matriz.exibirMatriz();
                break;

            case 5:
                matriz.ordenarMatrizCompleta();
                System.out.println("Matriz após ordenar como vetor:");
                matriz.exibirMatriz();
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
