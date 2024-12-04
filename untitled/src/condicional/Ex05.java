package condicional;

import java.util.Scanner;

/*
* Dados três valores A, B e C, construa um programa que imprima os valores de forma decrescente
* */
public class Ex05 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int aux;

        System.out.println("Insira o primeiro valor:");
        int num1 = tc.nextInt();
        System.out.println("Insira o segundo valor:");
        int num2 = tc.nextInt();
        System.out.println("Insira o terceiro valor:");
        int num3 = tc.nextInt();
        tc.close();

        if (num1 < num2 && num1 < num3) {
            if (num2 < num3){
                System.out.printf("%d < %d < %d", num1, num2, num3);
            } else {
                System.out.printf("%d < %d < %d", num1, num3, num2);
            }
        } else if (num2 < num1 && num2 < num3) {
            if (num1 < num3){
                System.out.printf("%d < %d < %d", num2, num1, num3);
            } else {
                System.out.printf("%d < %d < %d", num2, num3, num1);
            }
        }


    }
}
