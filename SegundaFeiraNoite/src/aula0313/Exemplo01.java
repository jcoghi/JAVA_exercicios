package aula0313;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        float a;
        double b;
        
        System.out.println("Digite um numero float");
        a = teclado.nextFloat();
        System.out.println("Digite um numero double");
        b = teclado.nextDouble();
        
        System.out.println("Digitou: " + a);
        System.out.println("Digitou: " + b);
        System.out.println("Soma = " + (a + b));
    }
            
}
