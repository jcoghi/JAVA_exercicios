/*
 * Ler 10 números e imprimir quantos pares e quantos ímpares foram digitados
 
*         AGORA COM TERNÁRIO 
 */
package aula0327;

import java.util.Scanner;

public class Exemplo06a {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int par = 0, impar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Numero: ");
            int numero = tc.nextInt();

            int cond = (numero % 2 == 0) ? par++ : impar++;

        }

        System.out.println("Foram " + par + " pares e " + impar + " impares");
        tc.close();
    }
}
