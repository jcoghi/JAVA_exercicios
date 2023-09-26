/*
Fila
Estrutura de controle de dados relacionada à lógica de
Primeiro que entra é o primeiro que sai (FIFO - First in First out)
*/

package aula0612.pilhaefila;

import java.util.Arrays;

public class Fila {

    public static void main(String[] args) {
        int[] vetor = new int[4];
        System.out.println("Inicialmente");
        System.out.println(Arrays.toString(vetor));

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 2;
        }
        System.out.println("Vetor com valores");
        System.out.println(Arrays.toString(vetor));

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
            vetor[i] = 0;
        }
        System.out.println("Finalizando a fila");
        System.out.println(Arrays.toString(vetor));
    }
}
