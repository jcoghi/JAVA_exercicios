package aula1909;

public class Determinante {

    public static void main(String[] args) {
        int[][] m = new int[2][2];
        
        int principal = 1, secundaria = 1, det;
        
        m[0][0] = 2;
        m[0][1] = 7;
        m[1][0] = 3;
        m[1][1] = 5;
        
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[0].length; c++){
                if (l == c) {
                    principal *= m[l][c];
                } else {
                    secundaria *= m[l][c];
                }
            }
        }
        det = principal - secundaria;
        System.out.println("determinante = " + det);
    }
}
