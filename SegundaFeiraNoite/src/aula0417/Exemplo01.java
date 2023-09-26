package aula0417;

import java.util.Arrays;

public class Exemplo01 {

    public static void main(String[] args) {
        
        int[][] numeros = new int[2][2];
        
        // Atribuindo valores a matriz
        for (int i = 0; i < numeros.length; i++) { // Acesso aos vetores
            for (int j = 0; j < numeros[0].length; j++) { // Acesso aos elementos
                numeros[i][j] = (int)(Math.random() * 10);
            }
        }
        
        System.out.println(numeros[0][1]);
        
//        for (int i = 0; i < numeros.length; i++) {
//            for (int elemento : numeros[i]) {
//                System.out.println(elemento);
//            }
//        }
        
    }
}








