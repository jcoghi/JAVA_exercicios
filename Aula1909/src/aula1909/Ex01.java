package aula1909;

import java.util.Arrays;

public class Ex01 {
// github.com/jcoghi/java

    public static void main(String[] args) {

        int[][] m = new int[2][2];

        m[0][0] = 2;
        m[0][1] = 7;
        m[1][0] = 3;
        m[1][1] = 5;

        for (int lin = 0; lin < 2; lin++) {
            for (int col = 0; col < 2; col++) {
                System.out.println(m[lin][col]);
            }
        }
        System.out.println(Arrays.deepToString(m));
    }
}
