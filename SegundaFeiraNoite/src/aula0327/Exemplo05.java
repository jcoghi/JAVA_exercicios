/*
 * Leia várias idades e calcule a média entre as idades 
 * usar uma variável para idade).
 */
package aula0327;

import java.util.Scanner;

public class Exemplo05 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double acumulador = 0;
        double contador = 0;
        
        System.out.println("Digite -1 a qq momento para sair");
        
        for (int i = 0; ;) {
            
            System.out.println("\nDigite uma idade:");
            int idade = tc.nextInt();
            
            if (idade == -1) {
                break;
            } else if (idade < 0 || idade > 120) {
                System.out.println("Idade invalida");
            } else {
                acumulador += idade;
                contador++;
            }
        }
        System.out.println("Media = " + acumulador/contador);
        tc.close();
    }
}
