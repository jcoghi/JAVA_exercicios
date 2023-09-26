/*
 * Criar um programa em que o usuário decide quantas idades digitará.
 * Todas as idades digitadas devem ser guardadas dentro de um vetor.
 * Após o último valor digitado, o programa retorna a média e a mediana 
 * das idades.
 */
package aula0410;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int soma = 0; // acumulador
        
        System.out.println("Informe a quantidade de elementos:");
        int qtd = tc.nextInt();
        
        int[] idades = new int[qtd];
        
        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe uma idade:");
            idades[i] = tc.nextInt();
            soma += idades[i];
        }
        
        for (int i = 0; i < qtd; i++) {
            System.out.println("i = " + idades[i]);
            for (int j = i+1; j < qtd; j++) {
                if(idades[j] < idades[i]) {
                    System.out.println("j = " + idades[j]);
                    int aux = idades[i];
                    idades[i] = idades[j];
                    idades[j] = aux;
                }
            }
        }
        
        System.out.println("Media = " + soma/idades.length);
        
        if (idades.length % 2 == 0) {
            qtd = qtd / 2;
            double mediana = (idades[qtd-1] + idades[qtd])/2;
            System.out.println("Mediana = " + mediana); 
        } else {
            qtd /= 2; // qtd = qtd / 2
            System.out.println("Mediana = " + idades[qtd]);
        }
        
        tc.close();
    }
}
