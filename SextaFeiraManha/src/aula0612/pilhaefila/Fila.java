/*
Fila
Estrutura de controle de dados relacionada à lógica de
Primeiro que entra é o primeiro que sai (FIFO - First in First out)
*/

package aula0612.pilhaefila;

import java.util.Arrays;

public class Fila {

    public static void main(String[] args) throws InterruptedException {
        int[] vetor = new int[4];
        System.out.println("Inicialmente: " + Arrays.toString(vetor));
        Thread.sleep(1500);
        
        System.out.println("Iniciando a fila");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 2;
            System.out.println("Criando a fila: " + Arrays.toString(vetor));
            Thread.sleep(1000);
        }
        
        System.out.println("Vetor com valores");
        System.out.println(Arrays.toString(vetor));
        Thread.sleep(5000);
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Saindo da fila: " + vetor[i]);
            vetor[i] = 0;
            Thread.sleep(1500);
        }
        
        System.out.println("Finalizando a fila");
        System.out.println(Arrays.toString(vetor));

    }
}
