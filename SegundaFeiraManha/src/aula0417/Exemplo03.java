/*
 Gerar 2 matrizes 2x2 com numeros aleatorios de 1 até 10. O programa deve 
retornar:
    [1, 2]  *  [1, 2] = [5, 6]
    [3, 4]     [3, 4]   [7, 8]
 */
package aula0417;

import java.util.Arrays;
import java.util.Random;

public class Exemplo03 {

    public static void main(String[] args) {
        Random fabiano = new Random();
        // CRIANDO AS MATRIZES
        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[matrizA.length][matrizA[0].length];
        int[][] matrizC = new int[matrizA.length][matrizA[0].length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizA[i][j] = fabiano.nextInt(1, 11);
                matrizB[i][j] = fabiano.nextInt(1, 11);
            }
        }

        System.out.println("MATRIZ A: " + Arrays.deepToString(matrizA));
        System.out.println("MATRIZ B: " + Arrays.deepToString(matrizB));

        for (int i = 0; i < matrizA.length; i++) { // Linhas
            for (int j = 0; j < matrizA[0].length; j++) { // Colunas
                for (int a = 0; a < matrizA[0].length; a++) {
                    matrizC[i][j] += matrizA[i][a] * matrizB[a][j];
                }
            }
        }
        System.out.println("MATRIZ C: " + Arrays.deepToString(matrizC));
    }
}
