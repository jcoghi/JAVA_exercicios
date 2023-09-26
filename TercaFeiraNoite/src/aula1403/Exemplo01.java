/*
 * Ex. 01 - Usuário digita numero inteiro 
 * e programa printa na tela
*/package aula1403;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int num;        
        System.out.println("Digite um numero inteiro:");
        num = teclado.nextInt();
        System.out.println(num);
    }
}
