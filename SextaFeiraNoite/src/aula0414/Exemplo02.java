/*
 Fazer um programa que cria um vetor A
 de 5 elementos inteiros aleatóriamente. O programa
 irá retornar um outro vetor B com 3 * o vetor A
 
        SÓ PODE USAR 1 FOR
 */
package aula0414;

import java.util.Arrays;
import java.util.Random;

public class Exemplo02 {
    public static void main(String[] args) {
        Random chiquinho = new Random();
        int []vetorA = new int[5];
        int []vetorB = new int[vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = chiquinho.nextInt(51);
            vetorB[i] = 3 * vetorA[i];
        }
        
        System.out.println(Arrays.toString(vetorA));
        System.out.println(Arrays.toString(vetorB));
    }
}
