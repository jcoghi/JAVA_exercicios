package cadastroLivros;

public class Livro {

    public String autor;
    public String nome;
    public int paginas;
    double valor = 100;

    public void printarNaTela() {
        System.out.println("Autor: " + this.autor);
        System.out.println("Livro: " + this.nome);
        System.out.println("Numero de paginas: " + paginas);
        System.out.println("Valor: " + valor);
    }
    
    public double promocao (int desconto) {
        valor = valor - (double)desconto/100 * valor;
        return valor;
    }
    
    public boolean setValor (double preco) {
        if (preco > 0 ) {
            valor = preco;
            return true;
        } else {
          return false;  
    }
    }
    
}
