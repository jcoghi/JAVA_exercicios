/*
Tendo como dados de entrada a altura e o sexo de uma pessoa, 
construa um programa que calcule seu peso ideal utilizando as 
seguintes fórmulas:
Homens: Peso Ideal = (72,7 * altura) - 58
Mulheres: Peso Ideal = (62,1 * altura) – 44,7
 */
package aula0320;

import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        char sexo;
        double altura;

        System.out.println("Altura?");
        altura = tc.nextDouble();

        System.out.println("Informe o sexo biologico:\n"
                + "M - Masculino\n"
                + "F - Feminino");
        sexo = tc.next().toLowerCase().charAt(0);

        if (sexo == 'm') {
            double pesoIdeal = 72.7 * altura - 58;
            System.out.printf("Peso ideal = %.2f\n", pesoIdeal);
        } else if (sexo == 'f') {
            double pesoIdeal = 62.1 * altura - 44.7;
            System.out.printf("Peso ideal = %.2f\n", pesoIdeal);
        } else {
            System.out.println("Opcao invalida");
        }

        tc.close();
    }

}
