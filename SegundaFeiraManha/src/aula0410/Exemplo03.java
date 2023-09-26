/*
 * Criar um vetor A com 15 elementos inteiros. 
 * Construir um vetor B de mesmo tamanho, sendo que cada 
 * elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de
 * A, ou seja: B[i] = sqrt(A[i]).
 */
package aula0410;

import java.util.Arrays;
import java.util.Random;

public class Exemplo03 {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        int[] vetorA = new int[15];
        double[] vetorB = new double[15];
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = aleatorio.nextInt(1, 50);
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        
        System.out.println(Arrays.toString(vetorA));
        System.out.println(Arrays.toString(vetorB));
    }
}
