/* Escrever um programa para exibir os números
   pares de 1 até 50 na tela*/
package aula0403;

public class Exemplo01 {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 50) {
            
            if (i % 2 == 0) {
                System.out.println(i);
            }
            
            i++;
        }

    }

}
