/*
    PROGRAMA QUE CALCULA O MÍNIMO MÚLTIPLO COMUM ENTRE DOIS NÚMEROS
*/

package listarevisao;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int mmc = 1;
        
        System.out.print("Digite um numero: ");
        int num1 = tc.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = tc.nextInt();
        
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                mmc = i;
            }
        }
        System.out.println("MMC = " + mmc);
        tc.close();
    }
}
