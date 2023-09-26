/* EXERCÍCIO 2: 
 * Construa um programa para determinar o IMC de um indivíduo.
 *    IMC = PESO / ALTURA²
 * Condições:
 *   < 20 => abaixo do peso
 *   20 <= imc <= 25 => normal
 *   25 < imc <= 30 => Sobre peso
 *   30 < imc <= 40 => Obeso
 *   > 40=> Obeso Mórbido 
*/
package aula0324;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double altura, peso, imc;
        
        System.out.println("Informe sua altura:");
        altura = tc.nextDouble();
        System.out.println("Informe seu peso:");
        peso = tc.nextDouble();
        
        imc = peso / Math.pow(altura, 2);
        
        System.out.printf("Seu IMC = %.2f\n", imc);
        
        if (imc > 0 && imc < 20) {
            System.out.println("Magrinho, vai comer!");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Ta no shape");
        } else if (imc >25 && imc <= 30) {
            System.out.println("Olha a pochete aparecendo");
        } else if (imc > 30 && imc <=40) {
            System.out.println("Eita que ta com capo de fusca");
        } else if( imc > 40) {
            System.out.println("Vixi, rola ai!");
        } else {
            System.out.println("Preenche essa bagaca certo!");
        }
        
        tc.close();
    }
    
}
