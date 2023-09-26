/* Ler 10 números e imprimir quantos são pares e quantos são ímpares.*/
package aula0327;

import java.util.Scanner;

public class Exemplo06 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        int numero, par = 0, impar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um numero");
            numero = tc.nextInt();

            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Pares = " + par);
        System.out.println("Impares = " + impar);

        tc.close();
    }
}
