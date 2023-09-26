/*
    ESCREVER OS 10 PRIMEIROS NÚMEROS DA SÉRIE DE FIBONACCI.
        1. COMEÇA COM ZERO;
        2. SEGUNDO ELEMENTO É O 1;
        3. OS OUTROS ELEMENTOS SÃO A SOMA DOS DOIS ANTERIORES
 */
package listarevisao;

import java.util.Arrays;

public class Ex09 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        vetor[0] = 0;
        vetor[1] = 1;
        for (int i = 2; i < vetor.length; i++) {
            vetor[i] = vetor[i-1] + vetor[i-2];
        }
        
        System.out.println(Arrays.toString(vetor));        
    }
    
}
