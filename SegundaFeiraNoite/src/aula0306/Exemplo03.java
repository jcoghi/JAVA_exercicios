/*
 * 4. Faça programa em que o usuário digita uma letra e o programa 
 * retorna o número inteiro do código ASCII referente àquela letra.
 */
package aula0306;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        char auxiliar, novaLetra;
        int numero;
        String letra;
        
        System.out.print("Digite um caracter: ");
        letra = tc.next();
        auxiliar = letra.charAt(0);
        
        numero = (int)auxiliar + 3;
        novaLetra = (char)numero;
        System.out.println(novaLetra);
    }
    
}
