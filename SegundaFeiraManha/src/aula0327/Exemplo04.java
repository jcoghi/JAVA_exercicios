/* Ler um valor inteiro (aceitar somente valores entre 1 e 10) e 
 * escrever a tabuada de 1 a 10 do valor lido.*/
package aula0327;

import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int entrada;

        System.out.println("Digite um numero entre 1 e 10");
        entrada = tc.nextInt();

        if (entrada >= 1 && entrada <= 10) {

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d * %d = %d \n", entrada, i, (entrada * i));
            }
        } else {
            System.out.println("Voce digitou algo errado");
        }
        tc.close();
    }
}
