package aula0403;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        var tc= new Scanner(System.in);
        int []vetor = new int[3];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tc.nextInt();
        }
        System.out.println("");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
        tc.close();
    }
    
}
