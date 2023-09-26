package aula1909;

import java.util.Arrays;

public class Ex02 {

    public static void main(String[] args) {
        int[][] m = new int[2][2];
        int[] v1 = new int[2];
        int[] v2 = new int[2];

        m[0][0] = 2;
        m[0][1] = 7;
        m[1][0] = 3;
        m[1][1] = 5;

        for (int lin = 0; lin < m.length; lin++) {
            if (lin == 0) {
                v1 = m[lin];
            } else {
                v2 = m[lin];
            }
        }
        System.out.println("v1 = " + Arrays.toString(v1));
        System.out.println("v2 = " + Arrays.toString(v2));
    }
}
