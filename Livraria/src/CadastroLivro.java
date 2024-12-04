public class CadastroLivro {

    String nome;
    int paginas;
    double preco;
    static double desconto = 0.25;

    CadastroLivro(String titulo, int pages, double valor) {
        nome = titulo;
        paginas = pages;
        if (valor > 0) {
            preco = valor;
        } else {
            System.out.println("Erro ao criar o objeto. O preço deve ser maior do que zero.");

        }
    }

    void printarInformacoes () {
        System.out.println("Titulo: " + nome);
        System.out.println("Páginas: " + paginas);
        System.out.println("Preço: " + preco);
        System.out.println("Desconto: " + desconto);
    }

    double precoComDesconto (double sale) {
        preco *= (1 - sale);
        return preco;
    }

}
