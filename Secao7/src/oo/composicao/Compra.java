package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    final List<Itens> itens = new ArrayList<>();

    void addItem(String nome, double preco, int quantidade) {
        if (quantidade == 0) {
            System.out.println("A quantidade deve ser maior do que zero");
        } else {
            itens.add(new Itens(nome, preco, quantidade));
        }
    }

    double getValorTotal() {
        double total = 0;

        for (Itens item : itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }

}
