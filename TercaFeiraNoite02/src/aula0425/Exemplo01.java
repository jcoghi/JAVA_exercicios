/* EXERCÍCIO 2 DA SEMANA PASSADA
 Fazer um programa que cria um vetor A
 de 5 elementos inteiros aleatóriamente.
 O programa irá retornar um outro 
 vetor B com raiz quadrada vetor A

 HARD -> Printar apenas com 2 casas decimais
 (int)(Math.sqrt())
 System.ou.printf("%.2f",variavel);
*/
package aula0425;

import java.util.Arrays;
import java.util.Scanner;


public class Exemplo01 {
    public static void main(String[] args) {
        
        int[][] matrizA = new int[2][2];
        double [][]matrizB = new double[2][2];
        Scanner tc = new Scanner(System.in);
        String []posicao = {"primeiro", "segundo", "terceiro", "quarto"};
        int cont = 0;
        
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                System.out.println("Digite o " + posicao[cont] + " numero:");
                matrizA[i][j] = tc.nextInt();
                matrizB[i][j] = (int)(Math.sqrt(matrizA[i][j]) * 100)/100.0;
                cont++;   
            }
        }
        
        System.out.println(Arrays.deepToString(matrizB));   
    }
}
