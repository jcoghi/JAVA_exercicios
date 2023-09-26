/*
    PROGRAMA VERIFICAR SE NÚMERO É PALÍNDROMO
 */
package listarevisao;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Entre com um número:");
        int numero = tc.nextInt();
        int temp = numero;
        int sum = 0; int r;
        
        while (numero > 0) {
            r = numero % 10;
            sum = (sum * 10) + r; // Reescrevendo o número em ordem inversa
            numero = numero / 10;
        }
        if (temp == sum) {
            System.out.println("Palindromo");
        } else {
            System.out.println("Nao palindromo");
        }
        
        tc.close();
                
    }
}
