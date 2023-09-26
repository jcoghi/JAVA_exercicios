/*
 * Vamos fazer um programa que o usuário informa sua idade e o programa 
 * devolve se ele é:
 * Criança (0 -> 11)
 * Adolescente (12 -> 17)
 * Adulto (18 -> 150)
 */
package aula0313;

import java.util.Scanner;

public class Exemplo05 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        int idade;

        System.out.println("Qual a sua idade?");
        idade = tc.nextInt();

        /*
         * Criança (0 -> 11)
         * Adolescente (12 -> 17)
         * Adulto (18 -> 150)
         */
        if (idade > 0 && idade < 12) {
            System.out.println("Você ainda é Criança");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Vc já é adolescente");
        } else if (idade > 18 && idade <= 150) {
            System.out.println("Você já é adulto");
        } else {
            System.out.println("Idade inválida");
        }

    }

}
