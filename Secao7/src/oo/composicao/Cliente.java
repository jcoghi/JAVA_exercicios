package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Compra> carrinho = new ArrayList<>();

    Cliente(String nome) {
        if (setNome(nome)) {
        } else {
            this.nome = nome;
        }
    }

    boolean setNome(String nome) {
        if (nome.isBlank() || nome.isBlank()){
            System.out.println("Digite um nome para o cliente");
            return false;
        }
        this.nome = nome;
        return true;
    }

    void setCarrinho(Compra compra) {
        carrinho.add(compra);
    }

    double getValorTotal() {
        double total = 0;

        for (Compra compra : carrinho) {
            total += compra.getValorTotal();
        }
        return total;
    }

}
