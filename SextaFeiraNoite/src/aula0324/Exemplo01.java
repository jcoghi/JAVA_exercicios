/* EXERCÍCIO 1: 
 * Escreva um programa que leia um número e informe se ele é divisível 
 * por 10, por 5 ou por 2 ou se não é divisível
 */
package aula0324;

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int num;
        
        System.out.println("Digite um numero");
        num = tc.nextInt();
        
        if(num % 10 == 0) {
            System.out.println("Divisivel por 10, por 5 e por 2");
        } else if (num % 5 == 0) {
            System.out.println("Divisilvel por 5");
        } else if (num % 2 == 0) {
            System.out.println("Divisivel por 2");
        } else {
            System.out.println("Nao eh divisivel por 10, nem por 5 e nem por 2.");
        }
        tc.close();
    }
}
