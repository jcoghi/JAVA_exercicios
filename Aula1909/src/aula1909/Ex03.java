package aula1909;

import java.util.Arrays;

public class Ex03 {

    public static void main(String[] args) {
        int[][] m = new int[3][3];
        int[][] t = new int[3][3];

        m[0][0] = 1;
        m[0][1] = 2;
        m[0][2] = 3;
        m[1][0] = 1;
        m[1][1] = 2;
        m[1][2] = 3;
        m[2][0] = 1;
        m[2][1] = 2;
        m[2][2] = 3;

        for (int lin = 0; lin < m.length; lin++) {
            for (int col = 0; col < m[0].length; col++) {
                if (lin == col) {
                    t[lin][col] = m[lin][col];
                } else {
                    t[col][lin] = m[lin][col];
                }
            }
            System.out.println(Arrays.toString(m[lin]));
        }
        System.out.println();
for (int lin = 0; lin < m.length; lin++) {
        System.out.println(Arrays.toString(t[lin]));
}
    }

}
