package aula0323;

import java.util.Scanner;

public class Exemplo13 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int pedido;
        
        System.out.println("******* CARDAPIO *********\n"+
                "1 - Hamburguer - R$ 25,00\n" + 
                "2 - Pizza - R$ 50,00\n" + 
                "3 - Dogao - R$ 15,00\n" + 
                "4 - Refri 2L - R$ 10,00\n" + 
                "Qual o seu pedido?");
        pedido = tc.nextInt();
        
        switch (pedido) {
            case 1 -> System.out.println("Voce pediu o hamburguer");
            case 2 -> System.out.println("Voce pediu o pizza");
            case 3 -> System.out.println("Voce pediu o dogao");
            case 4 -> System.out.println("Voce pediu o refri");
            default -> System.out.println("EEEEERRRRROOOUUUUUU");
        }
        
        tc.close();
    }
    
}
