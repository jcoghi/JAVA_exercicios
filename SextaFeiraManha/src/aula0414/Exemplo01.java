/*
 Fazer um programa que cria um vetor A e um vetor B, ambos com 5 elementos.
 O programa retornará vetorB = 3 * vetorA, mostrando os valores tanto do
 vetor A quanto do vetor B.
*/
package aula0414;

import java.util.Arrays;
import java.util.Random;

public class Exemplo01 {

    public static void main(String[] args) {
        
        int[] vetorA = new int[5];
        int []vetorB = new int[5];
        Random chiquinho = new Random();
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = chiquinho.nextInt(10);
            vetorB[i] = 3 * vetorA[i];
        }

        System.out.println(Arrays.toString(vetorA));
        System.out.println(Arrays.toString(vetorB));
    }
}
