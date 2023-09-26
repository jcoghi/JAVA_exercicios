package aula0324;

import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("""
                           ***** cardapio *****
                                1 - Hamburguer 
                                2 - Pizza 
                                3 - Dogao 
                                4 - Refri
                           Qual o seu pedido?""");
        int pedido = tc.nextInt();
        
        switch (pedido) {
            case 1 -> System.out.println("Seu pedido de hamburguer ficou em R$ 25,00");
            case 2 -> System.out.println("Seu pedido de pizza ficou em R$ 35,00");
            case 3 -> System.out.println("Seu pedido de dogao ficou em R$ 15,00");
            case 4 -> System.out.println("Seu pedido de refri ficou em R$ 10,00");
            default->System.out.println("Opcao invalida");
        }
        tc.close();
    }  
}
