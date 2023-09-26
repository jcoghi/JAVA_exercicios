package livraria;

public class Main {

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.autor = "João Felipe";
        livro1.nome = "Java for dummies";
        livro1.paginas = 1352;

        
        livro1.printarNaTela();
        
        if (livro1.setValor(150)) {
            System.out.println("Valor adicionado com sucesso.");
        } else {
            System.out.println("Valor nao adicionado.");
        }

    }

}
