package oo.composicao;

public class Itens {

    Produto produto;
    int quantidade;

    Itens(String nome, double preco, int quantidade){
        if (nome.isEmpty() || nome.isBlank()) {
            System.out.println("Digite um valor correto para o produto");
        } else {
            this.produto = new Produto(nome, preco);
            this.quantidade = quantidade;
        }
    }
}
