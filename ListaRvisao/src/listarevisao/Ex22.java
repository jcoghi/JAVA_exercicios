/*
    DETERMINAR O MENOR VALOR DE UM VETOR
 */
package listarevisao;

import java.util.Arrays;
import java.util.Random;

public class Ex22 {

    public static void main(String[] args) {
        int v[] = new int[10];

        for (int i = 0; i < 10; i++) {
            Random aleatorio = new Random();
            v[i] = aleatorio.nextInt(0, 50);
        }
        
        int temp = v[0];
        System.out.println("Vetor original: " + Arrays.toString(v));

        for (int i = 0; i < v.length; i++) {
            if (temp > v[i]) {
                temp = v[i];
            }
        }

        System.out.println("Menor: " + temp);
    }
}
