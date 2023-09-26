package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        // Declarando variáveis
        int numero;
        int fatorial = 1;
        Scanner teclado = new Scanner(System.in);
        // Entrada do número
        System.out.print("Digite um numero inteiro: ");
        numero = teclado.nextInt();
        // Laço de Repetição
        do {
            fatorial *= numero; // fatorial = fatorial * numero;
            numero--; // numero = numero - 1;
        } while ( numero > 0);
        // Saída
        System.out.println(fatorial);
        teclado.close();
    }
}
