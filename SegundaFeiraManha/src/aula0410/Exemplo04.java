/*
 * Criar um programa em que o usuário decide quantas idades digitará.
 * Todas as idades digitadas devem ser guardadas dentro de um vetor.
 * Após o último valor digitado, o programa retorna a média e a mediana 
 * das idades.
 */
package aula0410;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int aux;
        
        System.out.println("Informe quantas idades serao digitadas:");
        int vezes = tc.nextInt();
        
        int[] idades = new int[vezes];
        double acumulador = 0;
        
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite uma idade:");
            idades[i] = tc.nextInt();
            acumulador += idades[i];
        }
        
        for (int i = 0; i < idades.length; i++) {
            for (int j = i+1; j <idades.length; j++) {
                if (idades[j] < idades[i]) { // 10 5 -> Se 5 < 10?
                    aux = idades[j];
                    idades[j] = idades[i];
                    idades[i] = aux;
                }
            }
        }
        System.out.println("Os valores digitados foram: " + Arrays.toString(idades));
        // Média
        System.out.println("Media = " + (acumulador/idades.length));
        
        // MEDIANA
        if (idades.length % 2 == 0) {
            int n = vezes/2;
            System.out.println("Mediana = " + (idades[n-1] + idades[n])/2);
        }else {
            int n = vezes/2;
            System.out.println("Mediana = " + idades[n]);
        }

        tc.close();
    }
}
