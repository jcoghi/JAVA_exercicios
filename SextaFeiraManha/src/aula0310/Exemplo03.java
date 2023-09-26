/*
* Calcular o IMC de uma pessoa
* IMC = peso(kg) / altura²(metros)
 */
package aula0310;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double peso, altura, imc;
        
        System.out.println("Peso (kg):");
        peso = teclado.nextDouble();
        System.out.println("Altura (metros):");
        altura = teclado.nextDouble();
        
        imc = peso / Math.pow(altura,2);
                
        System.out.println("IMC = " + imc);
        System.out.printf("IMC = %.2f \n",imc);
    }
}
