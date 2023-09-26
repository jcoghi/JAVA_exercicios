/*
    PRINTAR O MAIOR VALOR DE UM VETOR
 */
package listarevisao;

import java.util.Arrays;

public class Ex16 {
    public static void main(String[] args) {
        int v1[] = new int[10];
        int maior = 0;
        
        for ( int i = 0; i < 10; i++) {
            v1[i] = (int)Math.round(Math.random() * 10);
        }
        
        for (int i = 1; i < v1.length; i++) {
            if (v1[i] > v1[i-1]) {
                maior = v1[i];
            }
        }
        
        System.out.println("O vetor: " + Arrays.toString(v1));
        System.out.println("O maior valor neste vetor: " + maior);
    }
    
}
