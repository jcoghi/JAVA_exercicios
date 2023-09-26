/* Crie um programa que calcula o fatorial de um número. 
 * Mas o incremento do for deve ser regressivo.*/
package aula0327;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int numero, fatorial = 1, i;
        
//      Atribuição do número a ser fatorado!
        System.out.println("Entre com um numero inteiro:");
        numero = tc.nextInt();
        
//      Cálculo do fatorial do número informado acima.
        for (i = numero; i > 0; i--){
            System.out.printf("i = %d \n", i);
            fatorial *= i; // fatorial = fatorial * i
        }
        
        System.out.printf("%d! = %d \n", numero, fatorial);
        System.out.println("i terminou em " + i);
        tc.close();
    }
    
}
