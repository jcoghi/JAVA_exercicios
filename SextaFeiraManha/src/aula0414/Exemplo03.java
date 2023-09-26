/*
 * Escreva um programa que leia 5 números inteiros do usuário e armazene-os em
 * um vetor chamado numeros. Em seguida, o programa deve imprimir o vetor 
 * organizado em ordem crescente.
 * NÃO PODE USAR QUALQUER MÉTODO SORT().
 * O ÚNICO IMPORT PERMITIDO É O SCANNER.
 */
package aula0414;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int []numeros = new int[5];
        String[] ordem = {"primeiro", "segundo", "terceiro", "quarto", "quinto"};

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite " + ordem[i] + " numero: ");
            numeros[i] = tc.nextInt();
        }
        
        for (int anterior = 0; anterior < numeros.length; anterior++) {
            for (int proximo = anterior + 1; proximo < numeros.length; proximo++) {
                if (numeros[proximo] < numeros[anterior]) {
                    int aux = numeros[anterior];
                    numeros[anterior] = numeros[proximo];
                    numeros[proximo] = aux;
                }
            }
        }
        
        System.out.println(Arrays.toString(numeros));
    }
}
