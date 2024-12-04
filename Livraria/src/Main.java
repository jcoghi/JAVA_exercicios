public class Main {
    public static void main(String[] args) {
        CadastroLivro livro = new CadastroLivro("Java", 200,100);

        livro.printarInformacoes();
        CadastroLivro.desconto = .25;
        livro.precoComDesconto(CadastroLivro.desconto);
        livro.printarInformacoes();

    }
}