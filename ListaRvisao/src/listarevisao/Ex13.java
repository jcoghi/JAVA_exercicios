/*
    PROGRAMA QUE COPIA TODOS OS ELEMENTOS DE UM VETOR EM OUTRO
*/
package listarevisao;

import java.util.Arrays;

public class Ex13 {
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4, 5, 6, 7};
        int[] v2 = new int[v1.length];
        
        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[i];
        }
        System.out.println("Vetor original " + Arrays.toString(v1));
        System.out.println("Vetor copiado " + Arrays.toString(v2));
        
        // Outra forma de printar
        
        System.out.print("Vetor original: ");
        for (int valor: v1) {
            System.out.print(valor + " ");
        }
        System.out.println("");
        
        System.out.print("Vetor copiado: ");
        for (int valor: v2) {
            System.out.print(valor + " ");
        }
        System.out.println("");
    }
    
}
