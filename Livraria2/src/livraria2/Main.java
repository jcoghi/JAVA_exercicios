package livraria2;

import cadastroLivros.Livro;

public class Main {

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        
        livro1.nome = "Como ajudar meus amiguinhos";
        livro1.autor = "Joao Felipe Coghi";
        livro1.paginas = 250;
        livro1.printarNaTela();
        
        
    }
    
}
