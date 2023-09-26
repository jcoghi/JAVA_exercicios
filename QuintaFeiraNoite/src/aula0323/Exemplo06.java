/*
 * Toda vez que ele traz um peso
 * de peixe maior do que o estabelecido no regimento de 
 * pesca do Estado de SP (50 quilos), ele deve pagar uma 
 * multa de R$ 4,00 por quilo excedente.
 * Faça um programa que, quando João informar o peso de 
 * peixes que trouxe no dia, o programa retorna o valor
 * da multa. 
 */

package aula0323;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        double limite = 50, multa = 4.0, peso;
        
        System.out.println("Quilos de peixe?");
        peso = tc.nextDouble();
        
        if (peso > limite) {
            multa = (peso - limite) * multa;
            System.out.printf("Multa de %.2f\n", multa);
        } else {
            System.out.println("Nao tem multa");
        }
    }  
}
