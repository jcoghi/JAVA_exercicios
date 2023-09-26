/*
 * Ler um valor inteiro (aceitar somente valores entre 1 e 10) e
 * escrever a tabuada de 1 a 10 do valor lido.
 */
package aula0327;

import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int numero;
        
        System.out.println("Insira um numero entre 1 e 10:");
        numero = tc.nextInt();
        
        if (numero >= 1 && numero <= 10) {
            for (int i = 1; i <= 10; i++) {
//                System.out.printf("%d * %d = %d\n",numero, 
//                        i, numero * i);
                System.out.println(numero + " * " + i + " = " + numero * i);
            }
        } else {
            System.out.println("Voce digitou um numero fora do esperado");
        }
        
        tc.close();
    }
}
