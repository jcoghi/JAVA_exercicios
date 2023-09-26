package prova;

import java.util.Arrays;
import java.util.Random;

public class Prova {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int n = 5;
        int[] vetor = new int[n];
        int determinante, principal = 1, secundaria = 1;
        int[][] matriz = new int[2][2];
        
        for (int i = 2; i <= n; i++) {
            vetor[i-1] = i;
        }
        
        for (int  l =0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                matriz[l][c] = vetor[aleatorio.nextInt(0,vetor.length)];
            }
            System.out.println(Arrays.toString(matriz[l]));
        }
        
        for (int  l =0; l < matriz.length; l++){
            for (int c = 0; c < matriz[0].length; c++){
                if (l == c) {
                    principal *= matriz[l][c];
                } else {
                    secundaria *= matriz[l][c];
                }
            }
        }
        determinante = principal - secundaria;
        System.out.println("Determinante: " + determinante);
        
    }
}
