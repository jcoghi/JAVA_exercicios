package aula0413;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizC = new int[3][3];
        

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                
                // INPUT DA MATRIZ A
                System.out.println("Digite um valor: ");
                matrizA[i][j] = tc.nextInt();
                
                // INPUT DA MATRIZ B
                matrizB[i][j] = (int)(Math.random() * 9 + 1);
                
                // INPUT DA MATRIZ C
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        
        System.out.println(Arrays.deepToString(matrizC));
        
        tc.close();
    }

}
