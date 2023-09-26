/*
 Criar um programa com 2 funções: entrada e soma.
 A função entrada devolverá ao programa principal 2 números
 digitados pelo usuário.
 A função soma receberá os 2 números e devolverá a soma ao 
 programa principal.
 O programa principal deverá printar: "A Soma ficou em " + soma

Exemplo: 
Entrada: 
Digite um número: 2
Digite um número: 3
Saída:
A soma ficou em 5
 */
package aula0417;

import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {
        double [] entradas = entrada();
        int fatorial = entrada(6);
        System.out.println(fatorial);
        System.out.println("A soma das entradas" + soma(entradas));
    }

    public static double[] entrada() {
        Scanner tc = new Scanner(System.in);
        double[] numeros = new double[2];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero");
            numeros[i] = tc.nextDouble();
        }

        tc.close();
        return numeros;
    }

    public static int entrada(int fatorial) {
        if (fatorial == 0 || fatorial == 1) {
            return 1;
        } else {
            return fatorial * entrada(fatorial - 1);
        }
    }

    public static double soma(double[] vetor) {
        double soma = 0;

        for (double v : vetor) {
            soma += v;
        }

        return soma;
    }

}
