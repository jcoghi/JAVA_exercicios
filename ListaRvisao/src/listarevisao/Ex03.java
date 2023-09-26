/*
    PROGRAMA QUE INFORMA SE O NÚMERO DIGITADO É PAR OU ÍMPAR
 */















package listarevisao;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Entre com um numero: ");
        int numero = tc.nextInt();
        
        if(numero % 2 == 0) {
            System.out.println(numero + " par");
        } else {
            System.out.println(numero + " impar");
        }
    }
}
