/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares.
*/
package aula0331;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int pares = 0, impares = 0;
        
        for ( int i = 0; i < 10; i++) {
            
            System.out.println("Digite um numero inteiro");
            int numero = tc.nextInt();
            
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Foram " + pares + " pares e " + impares + " impares");
        System.out.printf("Foram %d pares e %d impares \n", pares, impares);
        
        tc.close();
    }
}
