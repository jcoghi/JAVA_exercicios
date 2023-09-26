/*
 * Leia várias idades e calcule a média entre as idades 
 * usar uma variável para idade).
 */
package aula0328;

import java.util.Scanner;

public class Exemplo05 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        int idade, acumulador = 0; // acumulador "+"
        int contador = 0;
        System.out.println("Digite -1 para sair");
        
        for (int i = 0;;) {
            System.out.println("Digite uma idade");
            idade = tc.nextInt();
            if (idade == -1) {
                break;
            } else{
                acumulador += idade;
                contador++;
            }
        }

        System.out.println("Acumulador = " + acumulador);
        System.out.println("contador = " + contador);
        System.out.println("media = " + (double)acumulador / contador);
        tc.close();
    }
}
