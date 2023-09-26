package aula0414;

import java.util.Arrays;

public class Exemplo04 {
    public static void main(String[] args) {
        
        int[][] matriz = new int [2][2];
        
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length; col++) {
                matriz[lin][col] = 10;
            }
        }
        
        System.out.println(Arrays.deepToString(matriz));
        
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length;  col++) {
                System.out.println(matriz[lin][col]);
            }
        }
        System.out.println("");
        for (int[] vetor : matriz) {
            for(int num : vetor) {
                System.out.println(num);
            }
        }
    }
    
}
