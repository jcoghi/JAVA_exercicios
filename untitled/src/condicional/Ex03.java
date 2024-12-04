package condicional;

import java.util.Scanner;

/*
* A CEF concederá um crédito especial ocm juros de 2% aos seus clientes de acordo com o saldo
*  médio nos últimos 3 meses. Fazer um programa que leia o saldo médio de um cliente e calcule o valor do crédito
* de acordo com as regras:
*       0 -> 500: Sem crédito
*       501 -> 1000: 30% do saldo médio
*       1001 -> 3000: 40% do saldo médio
*       acima de 3001: 50% do saldo médio
* */
public class Ex03 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        double saldo = 0, media;
        int periodo;
        for (periodo = 0; periodo < 3; periodo++) {
            System.out.println("Informe o saldo da conta");
            saldo += tc.nextDouble();
        }

        media = saldo / periodo;

        if (media >=0 && media <=500) {
            System.out.println("Sem crédito liberado");
        } else if (media > 500 && media <= 1000) {
            System.out.println("Você tem um crédito de R$" + (media * 0.3) + " disponível. Aproveite a taxa de 2 % a.m.");
        } else if (media > 1000 && media <= 3000) {
            System.out.println("Você tem um crédito de R$" + (media * 0.4) + " disponível. Aproveite a taxa de 2 % a.m.");
        } else if (media > 3000) {
            System.out.println("Você tem um crédito de R$" + (media * 0.5) + " disponível. Aproveite a taxa de 2 % a.m.");
        } else {
            System.out.println("Você digitou algo errado. Confira os valores e tente novamente.");
        }

        tc.close();
    }
}
