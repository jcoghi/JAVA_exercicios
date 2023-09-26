/*
  CRIAR UM VETOR DE 5 ELEMENTOS INTEIROS ALEATÓRIOS E PRINTAR 
  NA TELA: [0, 1, 2, 3]
 */
package aula0411;

import java.util.Arrays;
import java.util.Random;

public class Exemplo01 {

    public static void main(String[] args) {

        Random num = new Random();
        int[] vetorA = new int[15]; 
        int[] vetorB = new int[15]; 
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = num.nextInt(11);
            vetorB[i] = 3 * vetorA[i];
        }
        
        System.out.println(Arrays.toString(vetorB));

    }

}
