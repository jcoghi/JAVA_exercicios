/*
 * Faça um programa que cria 1 vetor com 10 elementos utilizando números
 * aleatórios variando entre 1 e 10. Printe estes elementos em uma única linha
 */
package aula0410;

import java.util.Arrays;
import java.util.Random;

public class Exemplo02 {

    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        int[] vetor = new int[10];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(1,11);
        }
        
        System.out.println(Arrays.toString(vetor));
    }
}
