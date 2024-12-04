package condicional;

import java.util.Scanner;

import static java.lang.Thread.*;

public class Ex01 {
    public static void main(String[] args) throws InterruptedException {
        /* Escreva um programa que leia um número e informe se ele é divisível por 10, por 5 ou por 2 ou se não é divisível*/

        Scanner tc = new Scanner(System.in);

        System.out.println("Insira um número");
        int numero = tc.nextInt();

        if (numero % 10 == 0) {
            System.out.println(numero + " é divisível por 10, por 5 e por 2");
        } else if(numero % 5 == 0) {
            System.out.println(numero + " é divisível por 5");
        } else if( numero % 2 == 0) {
            System.out.println(numero + " é divisível por 2");
        } else {
            System.out.println(numero + " não é divisível por 10, nem por 5, nem por 2");
        }

        tc.close();

    }
}