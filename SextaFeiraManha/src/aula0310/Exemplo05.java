/*
 * Verificador de maior de 18 anos
 */
package aula0310;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
           
        System.out.println("Digite sua idade");
        idade = teclado.nextInt();
        
        if (idade >= 18) {
            System.out.println("Maior de 18 anos");
        } else {
            System.out.println("Menor de 18 anos");
        }
    }
}
