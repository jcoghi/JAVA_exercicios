/*
A Pliha é uma estrutura de dados com a lógica de 
Último que entra é o primeiro que sai (LIFO) Last in First out
*/

package aula0612.pilhaefila;

import java.util.Arrays;

public class Pilha {

    public static void main(String[] args) throws InterruptedException {
         
        int []vetor = new int[4];
        System.out.println("Inicialmente: " + Arrays.toString(vetor));
        Thread.sleep(1000);
        System.out.println("Criando pilha");
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 2;
            System.out.print(Arrays.toString(vetor));
            Thread.sleep(1000);
        }
        
        System.out.println("Pilha: " + Arrays.toString(vetor));
        Thread.sleep(2000);
        for (int i = vetor.length-1; i >= 0; i--) {
            System.out.println(vetor[i]);
            Thread.sleep(1000);
            vetor[i] = 0;
        }
        System.out.println("Finalmente: " + Arrays.toString(vetor));
    }

}
