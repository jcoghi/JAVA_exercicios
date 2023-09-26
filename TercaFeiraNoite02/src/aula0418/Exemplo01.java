/*
Criar 2 matrizes 2x2. A matriz A terá números aleatórios
entre 1 e 5. a matriz B receberá 3 * a matriz A.
*/
package aula0418;

import java.util.Arrays;
import java.util.Random;

public class Exemplo01 {

    public static void main(String[] args) {
        
        Random num = new Random();
        int[][] matrizA = new int[5][2];
        int[][] matrizB = new int[matrizA.length][matrizA[0].length];
        
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = num.nextInt(5)+1;
            }
        }
        
        System.out.println(Arrays.deepToString(matrizA));
        
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizB[i][j] = 3 * matrizA[i][j];
            }
        }
        
        System.out.println(Arrays.deepToString(matrizB));
    }

}
