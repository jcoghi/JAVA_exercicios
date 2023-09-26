/*
    CALCULAR O FATORIAL DE UM NÚMERO
*/















package listarevisao;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Entre com um numero: ");
        int numero = tc.nextInt();
        
        int fatorial = 1;
        
        for (int i = 2; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.println("Fatorial = " + fatorial);
    }
}
