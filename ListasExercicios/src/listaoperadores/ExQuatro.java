/*
  4. Faça programa em que o usuário digita uma letra e o programa
  retorna o número inteiro do código UNICODE referente àquela letra.
 */
package listaoperadores;

import java.util.Scanner;

public class ExQuatro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com um caractere: ");
        String entrada = teclado.next();
        
        int letra = entrada.charAt(0);

        System.out.println("O numero de " + entrada + " e " + letra);
        System.out.printf("O numero de %s e %d\n",
                entrada, letra);

        teclado.close();
    }
}
