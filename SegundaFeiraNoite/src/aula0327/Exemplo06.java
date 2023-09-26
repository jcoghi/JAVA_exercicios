/*
 * Ler 10 números e imprimir quantos pares e quantos ímpares foram digitados
 */
package aula0327;

import java.util.Scanner;

public class Exemplo06 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        int par = 0, impar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Numero: ");
            int numero = tc.nextInt();

            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }

        }
        
        System.out.println("Foram " + par + " pares e " + impar + " impares");
        tc.close();
    }
}
