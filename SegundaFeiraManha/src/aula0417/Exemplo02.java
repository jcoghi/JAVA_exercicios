/*
STANDARD:
Gerar 2 matrizes 2x2 com numeros aleatorios de 1 até 10. O programa deve 
retornar a soma entre as duas matrizes.

        HARD -> USAR SOMENTE 2 FOR
 */
package aula0417;

import java.util.Arrays;
import java.util.Random;

public class Exemplo02 {

    public static void main(String[] args) {

        Random fabiano = new Random();
        // CRIANDO AS MATRIZES
        int[][] matrizA = new int [2][2];
        int[][] matrizB = new int [matrizA.length][matrizA[0].length];
        int[][] matrizC = new int [matrizA.length][matrizA[0].length];
        
        //  ATRIBUIR VALORES AS MATRIZES A E B
        for (int i = 0; i < matrizA.length; i++) {
            for (int j  = 0; j < matrizA[0].length; j++) {
                matrizA[i][j] = fabiano.nextInt(10) + 1; 
                matrizB[i][j] = fabiano.nextInt(10) + 1;
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("MATRIZ A: " + Arrays.deepToString(matrizA));
        System.out.println("MATRIZ B: " + Arrays.deepToString(matrizB));
        System.out.println("MATRIZ C: " + Arrays.deepToString(matrizC));
    }
}
