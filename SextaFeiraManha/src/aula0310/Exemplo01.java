package aula0310;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, soma;
        
        System.out.println("Insira o primeiro numero: ");
        num1 = teclado.nextInt();
        System.out.println("Insira o segundo numero: ");
        num2 = teclado.nextInt();
        System.out.println("Insira o terceiro numero: ");
        num3 = teclado.nextInt();
        
        soma = num1 + num2 + num3;
        System.out.println("Soma: " + soma);
    }
}
