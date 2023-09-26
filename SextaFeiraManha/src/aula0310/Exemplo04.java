/*
 * Programa para verificar: 
 *    . número é positivo ou negativo
 *    . número é par ou ímpar
*/

package aula0310;

import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Insira um numero inteiro: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) { // Verificação se é par
            if(numero >=0){ // Verificação se é positivo
                System.out.println(numero + ": Positivo e par");
            } else {
                System.out.println(numero + ": Negativo e par");
            }
            
        } else { // Para os números ímpares
            if (numero >=  0){ // Verificação se é positivo
                System.out.println(numero + ": Positivo e impar");
            } else{ // O número é negativo
                System.out.println(numero + ": Negativo e impar");
            }
        }
        
        System.out.println("Passei aqui para finalizar o programa");
    }
}
