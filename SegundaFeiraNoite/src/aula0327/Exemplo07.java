/*
 * Faça um programa, utilizando for, que permita o usuário fazer
 * três contas de subtração. O usuário deve conseguir reconhecer que 
 * são três contas diferentes.
 */
package aula0327;

import java.util.Scanner;

public class Exemplo07 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        double num1, num2;

        for (int i = 0; i < 3; i++) {
            System.out.println("Primeiro numero:");
            num1 = tc.nextDouble();
            System.out.println("Segundo numero:");
            num2 = tc.nextDouble();

            System.out.printf("%.2f - %.2f = %.2f\n\n", 
                    num1, num2, num1 - num2);
        }

        tc.close();
    }
}
