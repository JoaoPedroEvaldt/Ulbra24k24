package Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos = new ArrayList<>();
    private double valorTotal = 0.0;

    public void adicionarAoCarrinho(Produto produto) {
        produtos.add(produto);
    }

    public double getTotal() {
        valorTotal = 0.0;
        for (Produto produto : produtos) {
            valorTotal += produto.valor;
        }
        return valorTotal;
    }
}
