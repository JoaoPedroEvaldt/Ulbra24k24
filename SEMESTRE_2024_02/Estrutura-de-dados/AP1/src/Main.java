public class Main {
    public static void main(String[] args) {

        Matriz matriz = new Matriz(3, 3);


        System.out.println("Matriz preenchida aleatoriamente:");
        matriz.preencherAleatorio();
        matriz.exibirMatriz();


        System.out.println("\nInserindo valor 99 na posição [1][1]:");
        matriz.inserirElemento(1, 1, 99);
        matriz.exibirMatriz();

        // Remove o valor da posição [1][1]
        System.out.println("\nRemovendo valor da posição [1][1]:");
        matriz.removerElemento(1, 1);
        matriz.exibirMatriz();

        // Preenche a matriz manualmente
        System.out.println("\nPreenchendo manualmente:");
        matriz.preencherManual();
        matriz.exibirMatriz();
    }
}
