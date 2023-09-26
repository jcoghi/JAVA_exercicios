/*
 * Leia várias idades e calcule a média entre as 
 * idades (usar uma variável para idade).
 */
package aula0331;

import java.util.Scanner;

public class Exemplo05 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        int idade = 0, cont = 0, i;

        for (int a = 0; a < 1;) {

            System.out.println("Informe uma idade:");
            i = tc.nextInt();

            if (i < 0 || i > 120) {
                System.out.println("Idade invalida");
            } else {
                idade += i;
                cont++;
            }

            for (int j = 0; j < 1 ;) {
                System.out.println("Deseja informar mais uma idade? S/N");
                String continua = tc.next().toLowerCase();

                if (continua.equals("n")) {
                    a++;
                    break;
                } else if (continua.equals("s")) {
                    j++;
                } else {
                    System.out.println("Opcao invalida");
                }
            }
        }

        System.out.println("Media = " + (double) idade / cont);
        tc.close();
    }
}
