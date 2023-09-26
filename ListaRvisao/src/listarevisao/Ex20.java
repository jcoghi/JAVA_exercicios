/*
    ORDENAR OS VALORES DE UM ARRAY EM ORDEM CRESCENTE
 */
package listarevisao;

import java.util.Arrays;
import java.util.Random;

public class Ex20 {

    public static void main(String[] args) {
        int v[] = new int[10];

        for (int i = 0; i < 10; i++) {
            Random aleatorio = new Random();
            v[i] = aleatorio.nextInt(0, 50);
            }
        
        System.out.println("Vetor original: " + Arrays.toString(v));
                
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                int temp;
                if (v[i] > v[j]) {
                    temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
        System.out.println("Vetor ordenado: " + Arrays.toString(v));
        
        
    }
}
