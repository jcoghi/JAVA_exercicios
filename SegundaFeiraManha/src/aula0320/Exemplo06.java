package aula0320;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("******  CARDAPIO ******");
        System.out.println("1 - Hamburguer - R$25,00");
        System.out.println("2 - Dogao - R$15,00");
        System.out.println("3 - Pizza - R$35,00");
        System.out.println("4 - Esfirra - R$20,00");
        System.out.println("Qual o pedido?");
        String pedido = tc.next();
        
        switch (pedido) {
            case "1" -> System.out.println("Voce escolheu a opcao 1");
            case "2" -> System.out.println("Voce escolheu a opcao 2");
            case "3" -> System.out.println("Voce escolheu a opcao 3");
            case "4" -> System.out.println("Voce escolheu a opcao 4");
            default -> System.out.println("Opcao invalida");
        }
        
        tc.close();
    }
    
}
