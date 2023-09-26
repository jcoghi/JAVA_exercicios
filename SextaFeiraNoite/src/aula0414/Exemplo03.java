/*
 Fazer um programa que cria um vetor A
 de 5 elementos inteiros aleatóriamente.
O programa irá retornar um outro 
vetor B com raiz quadrada vetor A

HARD -> Printar apenas com 2 casas decimais
(int)(Math.sqrt())
System.ou.printf("%.2f",variavel);
*/

package aula0414;

import java.util.Arrays;
import java.util.Random;

public class Exemplo03 {
    public static void main(String[] args) {
        
        Random chiquinho = new Random();
        int[] vetorA = new int[5];
        double []vetorB = new double[vetorA.length];

        for(int i = 0; i < vetorA.length; i++) {
            vetorA[i] = chiquinho.nextInt(1, 10);
            vetorB[i] = Math.round(Math.sqrt(vetorA[i]) * 1000) / 1000.;
        }
        
        System.out.println("vetor B = " + Arrays.toString(vetorB));

        
        
    }
}
