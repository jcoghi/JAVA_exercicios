/*
 * EXERCÍCIO 3:
 * A CEF concederá um crédito especial com juros de 2% aos seus clientes de 
 * acordo com o saldo médio nos últimos 3 meses. Fazer um programa que 
 * leia o saldo médio de um cliente e calcule o valor do crédito
 * de acordo com as regras:
 *       0 -> 500: Sem crédito
 *       501 -> 1000: 30% do saldo médio
 *       1001 -> 3000: 40% do saldo médio
 *       acima de 3001: 50% do saldo médio 
 */
package aula0324;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner tc = new  Scanner(System.in);
        double saldo = 0, media;
        int contador;
   
        System.out.println("Informe o saldo do primeiro mes:");
        saldo += tc.nextDouble(); // saldo = saldo + tc.nextDouble();
  
        System.out.println("Informe o saldo do segundo mes:");
        saldo += tc.nextDouble(); // saldo = saldo + tc.nextDouble();

        System.out.println("Informe o saldo do terceiro mes:");
        saldo += tc.nextDouble(); // saldo = saldo + tc.nextDouble();
  
        media = saldo / 3;
        
        System.out.printf("A media ficou em R$ %.2f \n", media);
        
        if ( media > 0 && media <= 500) {
            System.out.println("Sem credito no mercado \n");
        } else if(media > 500 && media <=1000) {
            System.out.printf("Seu credito esta em R$ %.2f \n", (0.3*media));
        } else if (media > 1000 && media <= 3000) {
            System.out.printf("Seu credito esta em R$ %.2f \n", (0.4*media));
        } else if( media > 3000) {
            System.out.printf("Seu credito esta em R$ %.2f \n", (0.5*media));
        } else {
            System.out.println("Verifique os valores e tente novamente");
        }
        
        tc.close();
    }
}
