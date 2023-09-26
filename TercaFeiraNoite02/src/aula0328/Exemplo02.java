/* github.com/jcoghi/java -> ListaFor
 * Crie um programa que calcula o fatorial de um número. 
 * Mas o incremento do for deve ser regressivo.
 */
package aula0328;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int numero, fatorial = 1;
        
        System.out.println("Digite um numero:");
        numero = tc.nextInt();
        
        for (int i = numero; i > 1; i--) {
            fatorial *= i; // fatorial = fatorial * i
        }
        
        System.out.println(numero + "! = " + fatorial);
        tc.close();
    }
}
