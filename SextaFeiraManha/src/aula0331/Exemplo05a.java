/*
 * Leia várias idades e calcule a média entre as 
 * idades (usar uma variável para idade).
 */
package aula0331;

import java.util.Scanner;

public class Exemplo05a {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        int idade = 0, cont = 0;

        System.out.println("**************");
        System.out.println("Digite -1 a qualquer momento para sair");
        System.out.println("**************");
        
        for (int i = 0;;) {

            System.out.println("Informe uma idade");
            i = tc.nextInt();
            System.out.println("----------------------------");
            

            if (i == -1) {
                System.out.println("Voce esta saindo do programa");
                break;
            } if (i <= -2 || i >= 120) {
                System.out.println("Informe uma idade valida");
                System.out.println("----------------------------");
            }
            else {
                idade += i;
                cont++;
            }
        }
          
        System.out.println("media = " + (double)idade/cont);
        tc.close();
    }
}
