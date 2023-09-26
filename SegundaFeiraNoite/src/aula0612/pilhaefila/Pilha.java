/*
A Pliha é uma estrutura de dados com a lógica de 
Último que entra é o primeiro que sai (LIFO) Last in First out
*/

package aula0612.pilhaefila;

import java.util.Arrays;

public class Pilha {

    public static void main(String[] args) {
         
        int []vetor = new int[4];
        System.out.println("Inicialmente: " + Arrays.toString(vetor));
        
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 2;
            System.out.println(Arrays.toString(vetor));
        }
        
        System.out.println("Pilha: " + Arrays.toString(vetor));
        
        for (int i = vetor.length-1; i >= 0; i--) {
            System.out.println(vetor[i]);
            vetor[i] = 0;
        }
        System.out.println("Finalmente: " + Arrays.toString(vetor));
    }

}
