package aula0327;

import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
//        int inicio = 0;
//        // Laço determinado de repetição WHILE 
//        while(inicio < 3) {
//            System.out.println(inicio);
//            inicio++;
//        }
//        
        boolean online = true;
        int total = 0;
        
        while (online) {
            System.out.println("***** CARDAPIO *******\n"+
                               " 1 - Hamburguer\n" + 
                               " 2 - Hot-dog\n" + 
                               " 3 - Fritas\n" + "Qual o seu pedido?");
            int pedido = tc.nextInt();
            
            switch (pedido) {
                case 1 -> {
                    total += 20;
                    System.out.println("Seu pedido esta em R$" + total);
                }
                case 2 -> {
                    total += 15;
                    System.out.println("Seu pedido esta em R$" + total);
                }
                case 3 -> {
                    total += 10;
                    System.out.println("Seu pedido esta em R$" + total);
                }
                default -> {
                    System.out.println("Selecione uma opcao válida");
                }
            }
            System.out.println("Deseja continuar? [S]/[N]");
            char continuar = tc.next().toUpperCase().charAt(0);
            if (continuar == 'N') {
                System.out.println("total do pedido: R$" + total);
                online = false;
            }
        }
        tc.close();
    }
}
