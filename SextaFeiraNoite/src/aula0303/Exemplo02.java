package aula0303;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        /*
         * Fazer um programa que some dois números DOUBLE
        */
        System.out.println("*******************************************");
        System.out.println("Meu e-mail: joao.coghi@animaeducacao.com.br");
        System.out.println("********************************************");
        
        Scanner teclado = new Scanner(System.in);
        
        double num1, num2;
        
        System.out.println("Digite o primeiro numero:");
        num1 = teclado.nextDouble();
        System.out.println("Digite o segundo numero:");
        num2 = teclado.nextDouble();
        
        System.out.println("A soma é " + Double.sum(num1, num2));
        
    }
}
