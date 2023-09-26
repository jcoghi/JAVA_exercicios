/*
 * Neste exercício você deverá projetar um programa que imprime na 
 * tela números de 1 a 100, mas:
 *    a. Sempre que o número for divisível por 3, aparece fizz. 
 *    b. Sempre que um número for divisível por 5, aparece buzz.
 *    c. Quando for divisível pelos 2, aparece Fizz Buzz.
 */
package aula0327;

public class Exemplo08 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
