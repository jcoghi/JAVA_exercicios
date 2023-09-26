/*Exemplo de Foreach*/

package aula0413;

import java.util.Arrays;

public class Exemplo01 {

    public static void main(String[] args) {
        
        int[][] matriz = new int[2][2];
        
        matriz[0][0] = 1000;
        matriz[0][1] = 20;
        matriz[1][0] = 30;
        matriz[1][1] = 40;
        
        System.out.println(Arrays.deepToString(matriz));
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = (int)(Math.random()*100);
            }
        }
        
        System.out.println(Arrays.deepToString(matriz));
    }
}
/*
 CRIAR UM PROGRAMA COM 2 MATRIZES 3x3. O USUÁRIO DIGITARÁ OS VALORES
 DA PRIMEIRA MATRIZ. A SEGUNDA MATRIZ SERÁ CRIADA COM NÚMEROS RANDOM
 ENTRE 1 E 10. O PROGRAMA RETORNA A SOMA DAS DUAS MATRIZES.
*/