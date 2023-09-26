/*
    PRINTAR NA TELA O SEGUNDO MAIOR VALOR DE UM VETOR
 */
package listarevisao;

import java.util.Arrays;
import java.util.Random;

public class Ex24 {
    public static void main(String[] args) {
        int v[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            Random aleatorio = new Random();
            v[i] = aleatorio.nextInt(0, 50);
        }
        
        int temp = v[0];
        System.out.println("Vetor original: " + Arrays.toString(v));

        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++)
            if (v[i] < v[j]) {
                temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }
        }
        System.out.println("Vetor original: " + Arrays.toString(v));
        System.out.println("Maior: " + v[1]);
    }   
}
