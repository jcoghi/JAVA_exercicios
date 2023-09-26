/*
 * Faça um programa que leia um número inteiro e o imprima;
 */
package aula0306;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um numero inteiro: ");
        numero = tc.nextInt();
        
        System.out.println("O numero digitado foi " + numero);
        
    }
}
