import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Método usado para adicionar um item à lista
    public static void adicionarItem(ArrayList<String> lista, String item) {
        lista.add(item);
        System.out.println("Item '" + item + "' adicionado com sucesso!");
    }

    // Esse método é usado para exibir todos os itens da lista
    public static void listarItens(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("Itens na lista:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(i + " - " + lista.get(i));
            }
        }
    }

    // Método feito para atualizar um item na lista
    public static void atualizarItem(ArrayList<String> lista, int indice, String novoItem) {
        if (indice >= 0 && indice < lista.size()) {
            lista.set(indice, novoItem);
            System.out.println("Item atualizado com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Método para remover um item da lista
    public static void removerItem(ArrayList<String> lista, int indice) {
        if (indice >= 0 && indice < lista.size()) {
            String removido = lista.remove(indice);
            System.out.println("Item '" + removido + "' removido com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        while (true) {
            System.out.println("\n--- CRUD com ArrayList ---");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Listar itens");
            System.out.println("3 - Atualizar item");
            System.out.println("4 - Remover item");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o item para adicionar: ");
                    String item = scanner.nextLine();
                    adicionarItem(lista, item);
                    break;

                case 2:
                    listarItens(lista);
                    break;

                case 3:
                    listarItens(lista);
                    System.out.print("Digite o índice do item a ser atualizado: ");
                    int indiceAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o novo valor: ");
                    String novoItem = scanner.nextLine();
                    atualizarItem(lista, indiceAtualizar, novoItem);
                    break;

                case 4:
                    listarItens(lista);
                    System.out.print("Digite o índice do item a ser removido: ");
                    int indiceRemover = scanner.nextInt();
                    removerItem(lista, indiceRemover);
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
