/*
    USUÁRIO DIGITA QUANTOS VALORES TEREMOS DENTRO DO VETOR;
    O VETOR SERÁ POVOADO ALEATORIAMENTE COM NÚMEROS ENTRE 0 E 10;
    PROGRAMA RETORNA A SOMA DE TODOS OS ELEMENTOS
 */

package listarevisao;

import java.util.Arrays;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        
     Scanner tc = new Scanner(System.in);
        System.out.print("Qual o comprimento do vetor: ");
        int n = tc.nextInt();
        int v1[] = new int[n];
        int soma = 0;
        
        for ( int i = 0; i < n; i++) {
            v1[i] = (int)Math.round(Math.random() * 10);
            soma += v1[i];
        }
        System.out.println("Vetor: " + Arrays.toString(v1));
        System.out.println("A soma dos seus elementos: " + soma);
    }
}
