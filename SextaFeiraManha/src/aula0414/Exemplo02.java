/*
 * Escreva um programa que leia 5 números inteiros do usuário e armazene-os em
 * um vetor chamado numeros. Em seguida, o programa deve imprimir a média, o
 * maior e o menor valores digitados.
 * NÃO PODE USAR QUALQUER MÉTODO JÁ PREVIAMENTE DESENVOLVIDO POR TERCEIROS.
 * O ÚNICO IMPORT PERMITIDO É O SCANNER.
 */
package aula0414;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int []numeros = new int[5];
        int maior = Integer.MIN_VALUE; 
        int menor = Integer.MAX_VALUE; 
        double soma = 0;
        
        for(int a = 0; a < numeros.length; a++) {
            System.out.println("Digite um numero: ");
            numeros[a] = tc.nextInt();
            soma += numeros[a]; 
            maior = (numeros[a] > maior) ? numeros[a]: maior;
            menor = (numeros[a] < menor) ? numeros[a] : menor;
        }
        
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
        System.out.println("Media  = " + soma / numeros.length);
        tc.close();
    }
}
