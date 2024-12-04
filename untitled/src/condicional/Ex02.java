package condicional;

import java.util.Scanner;

/*
* Construa um programa para determinar o IMC de um indivíduo.
*    IMC = PESO / ALTURA²
* Condições:
*   < 20 => abaixo do peso
* 20 <= imc <= 25 => normal
* 25 < imc <= 30 => Sobre peso
* 30 < imc <= 40 => Obeso
* > 40=> Obeso Mórbido
* */
public class Ex02 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        System.out.println("Insira seu peso");
        double peso = tc.nextDouble();
        System.out.println("Insira sua altura");
        double altura = tc.nextDouble();

        double imc = peso / Math.pow(altura,2);

        if(imc < 20) {
            System.out.printf("Abaixo do peso. IMC = %.2f", imc);
        } else if(imc >= 20 && imc <= 25) {
            System.out.printf("Peso Normal. IMC = %.2f", imc);
        } else if(imc > 25 && imc <=30) {
            System.out.printf("Sobre Peso. IMC = %.2f", imc);
        }else if(imc >=30 && imc <=40) {
            System.out.printf("Obeso. IMC = %.2f", imc);
        } else if(imc > 40) {
            System.out.printf("Obeso Mórbido. IMC = %.2f", imc);
        }else {
            System.out.println("Erro no cálculo do IMC");
        }

        tc.close();
    }

}
