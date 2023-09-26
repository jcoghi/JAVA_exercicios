/*
 * Crie um programa que calcula o fatorial de um número. 
 * Mas o incremento do for deve ser regressivo.
 */
package aula0327;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int fatorial = 1, numero; //acumulador
        
        System.out.println("Inisira um numero inteiro:");
        numero = tc.nextInt();
        
        for (int i = numero; i >=1; i--) {
            System.out.printf("%d * %d = ", fatorial, i);
            fatorial *= i;
            System.out.printf("%d \n", fatorial);
        }
        
        tc.close();
    }
}
