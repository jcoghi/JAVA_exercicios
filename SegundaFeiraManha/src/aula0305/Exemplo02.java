/*
* PROGRAMA QUE LÊ E IMPRIME NA TELA A SOMA DE 2 NÚMEROS.
*/
package aula0305;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num1, num2, soma;
        System.out.println("Digite o primeiro inteiro:");
        num1 = teclado.nextInt();
        System.out.println("Digite o segundo inteiro:");
        num2 = teclado.nextInt();

        soma = Integer.sum(num1, num2);
        System.out.println("A soma ficou em " + soma);        
    }
}
