public class Produto {
    final String nome;
    final double preco;
    final double desconto;

    Produto(String nome, double preco, double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString() {
        double precoFinal = preco * (1 - desconto);
        return this.nome + " tem preço de R$ " + precoFinal;
    }
}
