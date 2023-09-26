package aula02;

import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero");
        double primeiroNumero = teclado.nextDouble();
        System.out.print("Qual operacao desejada? ");
        char operador = teclado.next().charAt(0);
        switch(operador){
            case 45 -> {
                System.out.println("Digite o segundo numero");
                double segundoNumero = teclado.nextDouble();
                double resultado = primeiroNumero - segundoNumero;
                System.out.println(resultado);
            }
            case 43 -> {
                System.out.println("Digite o segundo numero");
                double segundoNumero = teclado.nextDouble();
                double resultado = primeiroNumero + segundoNumero;
                System.out.println(resultado);
            }
            case 42 -> {
                System.out.println("Digite o segundo numero");
                double segundoNumero = teclado.nextDouble();
                double resultado = primeiroNumero * segundoNumero;
                System.out.println(resultado);
            }
            case 47 -> {
                System.out.println("Digite o segundo numero");
                double segundoNumero = teclado.nextDouble();
                double resultado = primeiroNumero / segundoNumero;
                System.out.println(resultado);
            }
        }
    }
    
}
