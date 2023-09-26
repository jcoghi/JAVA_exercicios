package aula0417;

import java.util.Arrays;

public class Exemplo05 {

    public static void main(String[] args) {
        
        int[][] matrizA = new int [2][2];
        int[][] matrizB = new int [matrizA.length][matrizA[0].length];
        int[][] matrizC = new int [matrizA.length][matrizA[0].length];
        
        for(int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizA[0].length; j++){
                matrizA[i][j] = fabiano();
                matrizB[i][j] = fabiano();
                matrizC[i][j] = soma(matrizA[i][j], matrizB[i][j]);
            }
        }
        System.out.println("Matriz C: " + Arrays.deepToString(matrizC));
    }
    
    public static int fabiano() {
        int num = (int)(Math.random() * 10) + 1;
        return num;
    }
    
    public static int soma(int a, int b) {
        return a+b;
    } 

}
