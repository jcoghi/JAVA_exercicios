package livraria;

public class CadastroLivro {
    // Atributos da classe
    private String titulo;
    private String autor;
    int paginas;
    private double preco;

    CadastroLivro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    // pegar o Nome do objeto
    String getAutor(){
        return autor;
    }
    // pegar o Titulo do objeto
    String getTitulo() {
        return titulo;
    }
    // colocar informação no atributo
    void setAutor(String autor) {
        this.autor = autor;
    }
    void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
            System.out.println("Preco alterado com sucesso");
        }
        System.out.println("Preco nao alterado");
    }
    
    
    
    void printarNaTela(CadastroLivro origem) {
        System.out.println("Autor: " + origem.autor);
        System.out.println("Titulo: " + origem.titulo);
        System.out.println("Paginas: " + origem.paginas);
        System.out.println("Preco: " + origem.preco);
    }
}
