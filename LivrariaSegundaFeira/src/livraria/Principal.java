package livraria;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o autor do livro.");
        String autor = teclado.nextLine();
        
        CadastroLivro livro1 = new CadastroLivro
        ("Java 4u", autor);
        
        System.out.println("Digite o preco do livro:");
        double preco = teclado.nextDouble();
        livro1.setPreco(preco);
        

        
        
    }
}
