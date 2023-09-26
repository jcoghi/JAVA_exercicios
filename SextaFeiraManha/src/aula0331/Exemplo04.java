/*
 * Ler um valor inteiro (aceitar somente valores entre 1 e 10) 
 * e escrever a tabuada de 1 a 10 do valor lido
 */
package aula0331;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int num;
        
        System.out.println("Numero de 1 a 10");
        num = tc.nextInt();
        
        if (num < 1 || num > 10) {
            System.out.println("Digite um numero na faixa correta.");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d * %d = %d \n", num, i, (num*i));
            }
        }
        
        tc.close();
    }
}
