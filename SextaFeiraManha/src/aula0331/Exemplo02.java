/*
 * Crie um programa que calcula o fatorial de um número.
 * Mas o incremento do for deve ser regressivo
 */
package aula0331;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int num, fatorial = 1 ;
        
        System.out.println("Digite um numero");
        num = tc.nextInt();
        
        for (int i = num; i >1; i--) {
            fatorial *= i;
        }
        
        System.out.printf("%d! = %d \n", num, fatorial);
        
        tc.close();
    }
}
