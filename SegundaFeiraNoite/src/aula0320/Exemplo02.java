/*
Tendo como dados de entrada a altura e o sexo de uma pessoa, 
construa um programa que calcule seu peso ideal utilizando as 
seguintes fórmulas:
        Homens: pesoIdeal = (72.7 * altura) - 58
        Mulheres: pesoIdeal = (62.1 * altura) – 44.7
 */
package aula0320;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double altura, pesoIdeal;
        String sexo;

        System.out.println("Altura:");
        altura = teclado.nextDouble();

        System.out.println("Sexo biologico: \"M\" ou [F]");
        sexo = teclado.next();

        if (sexo.equals("M") || sexo.equals("m")) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Peso Ideal = %.2f\n", pesoIdeal);
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Peso Ideal = %.2f\n", pesoIdeal);
        } else {
            System.out.println("Opcao invalida");
        }

        teclado.close();
    }
}
