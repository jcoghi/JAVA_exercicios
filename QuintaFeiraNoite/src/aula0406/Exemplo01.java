/*
 * Criar 2 vetores iguais
 */
package aula0406;

import java.util.Arrays;
import java.util.Random;

public class Exemplo01 {

    public static void main(String[] args) {
        
        Random ale = new Random();
        int a[] = new int[5];
        int b[] = new int[5];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = ale.nextInt(11);
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        
        System.out.println(Arrays.toString(b));
                
    }

}
