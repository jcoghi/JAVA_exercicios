/*
Tendo como dados de entrada a altura e o sexo de uma pessoa,
construa um programa que calcule seu peso ideal utilizando
as seguintes fórmulas:
    Homens: Peso Ideal = (72,7 * altura) - 58
    Mulheres: Peso Ideal = (62,1 * altura) – 44,7
*/
package aula0321;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double altura, pesoIdeal;
        int sexo;
        
        System.out.println("Sua altura?");
        altura = teclado.nextDouble();
        
        System.out.println("Seu sexo biologico?");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");
        sexo = teclado.nextInt();
        
        switch (sexo) {
            case 1: //Caso Masculino
                pesoIdeal = (72.7 * altura) - 58;
                System.out.println(pesoIdeal);
                break;
            case 2: // Caso Feminino
                pesoIdeal = (62.1 * altura) - 44.7;
                System.out.println(pesoIdeal);
                break;
            default: // Caso erro de digitação
                System.out.println("Opcao invalida");
        }

        
        teclado.close();
        
    }
}
