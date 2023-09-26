/*
    Somar de duas matrizes 2x2
 */
package listarevisao;

import java.util.Arrays;
import java.util.Random;

public class Ex25 {

    public static void main(String[] args) {
        int[][] m1 = new int[2][2];
        int[][] m2 = new int[2][2];
        int[][] soma = new int[2][2];

        for (int i = 0; i < soma.length; i++) {
            Random aleatorio = new Random();
            for (int j = 0; j < soma[0].length; j++) {
                m1[i][j] = aleatorio.nextInt(0, 50);
                m2[i][j] = aleatorio.nextInt(0, 50);
            }
        }

        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma[0].length; j++) {
                soma[i][j] = m1[i][j] + m2[i][j];
            }
        }

        for (int i = 0; i < m1.length; i++) {
            System.out.println(Arrays.toString(m1[i]) + " " + Arrays.toString(m2[i]));
        }
        System.out.println("");
        for (int[] vetores : soma) {
            System.out.println(Arrays.toString(vetores));
        }
        System.out.println(Arrays.deepToString(soma));
    }

}
