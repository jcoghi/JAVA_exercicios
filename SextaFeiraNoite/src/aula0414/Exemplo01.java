package aula0414;

import java.util.Arrays;
import java.util.Random;

public class Exemplo01 {
    public static void main(String[] args) {
        
        Random chiquinho = new Random();
        int []v = new int[5]; // [0, 0, 0]
        String[] nomes = {"Joao", "Fabiano", "Soraia"};
        double soma = 0;
        
        for (int i=0; i < v.length;i++){
            v[i] = chiquinho.nextInt(1,11);
        }

        
        System.out.println(Arrays.toString(v));
    
        for (int a : v) {
            soma += a;
        }
        
        System.out.println("Media = " + soma / v.length);
    }
    
}
