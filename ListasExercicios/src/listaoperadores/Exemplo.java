package listaoperadores;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        boolean apostando =true;
        Scanner teclado = new Scanner(System.in);
        int carteira = 1000;
        
        while (apostando) {
            System.out.print("Digite a aposta: ");
            int aposta = teclado.nextInt();
            boolean jogando = true;
            
            while (jogando) {
                if (aposta > 100) {
                    System.out.println("Aposta muito alta");
                    jogando = false;
                } else {
                    System.out.println("Aposta muito baixa");
                    jogando = false;
                    apostando = false;
                }
            }
            
        }
    }
}
