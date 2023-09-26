/*
 * Leia várias idades e calcule a média entre as idades 
 * usar uma variável para idade).
 */
package aula0327;

import java.util.Scanner;

public class Exemplo05a {

    public static void main(String[] args) {
            
        Scanner tc = new Scanner(System.in);
        double acumulador = 0, contador = 0;
        int idade;
        
        for (int i = 0; ; ) {
            System.out.println("Insira uma idade:");
            idade = tc.nextInt();
            
            if(idade < 0 || idade > 120) {
                System.out.println("Erro");
            } else {
                acumulador += idade;
                contador++;
            }
            
            System.out.println("\nDeseja continuar?[S]/[N]");
            char continuar = tc.next().toLowerCase().charAt(0);
            
            if (continuar == 'n') {
                break;
            }
            
        }
        System.out.println("media = " + acumulador / contador);
        tc.close();
    }
}
