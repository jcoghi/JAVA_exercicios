package aula0316;

/*
EXERCÍCIO 04 - PEGA CARACTER E CONVERTER PARA UM IINTEIRO
*/

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
   
        Scanner teclado = new Scanner(System.in);
        String palavra;
        System.out.println("Digite uma letra:");
        palavra = teclado.next();
        char letra = palavra.charAt(0);
        
        System.out.println((int)letra);
    }
}
