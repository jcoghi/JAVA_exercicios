/*
 * Programa de casting
 * Conversão de caracter para número inteiro
 */
package aula0305;

import java.util.Scanner;
        
public class Exemplo04 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        char letra;
        String entrada;
        int numero;
        
        System.out.println("Digite um caracter: ");
        entrada = tc.next();
        letra = entrada.charAt(0);
        System.out.println(letra);
        numero = (int)letra;
        System.out.println(numero);
    }
    
}
