package aula0411;

import java.util.Arrays;
import java.util.Random;

public class Exemplo03 {
    public static void main(String[] args) {
        
        Random num = new Random();
        int[] vetorA = new int[15]; 
        double soma = 0; 
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = num.nextInt(10) + 1;
            soma += vetorA[i];
        }
        
        Arrays.sort(vetorA);
        System.out.println(Arrays.toString(vetorA));
        System.out.println(soma / vetorA.length);
    }
    
}
