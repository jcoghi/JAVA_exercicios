/*
    PROGRAMA PARA ORDENAR EM ORDEM CRESCENTE 3 NÚMEROS.
*/

package listarevisao;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner tc = new Scanner(System.in);
        
        System.out.print("Primeiro numero: ");
        num1 = tc.nextInt();
        System.out.print("Segundo numero: ");
        num2 = tc.nextInt();
        System.out.print("Terceiro numero: ");
        num3 = tc.nextInt();
        
        if(num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.printf("%d, %d, %d \n", num1, num2, num3);                
            }
            else {
                System.out.printf("%d, %d, %d \n", num1, num3, num2);                
            }
        }else if(num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.printf("%d, %d, %d \n", num2, num1, num3);                
            }
            else {
                System.out.printf("%d, %d, %d \n", num2, num3, num1);                
            }
        } else {
            if (num1 < num2) {
                System.out.printf("%d, %d, %d \n", num3, num1, num2);                
            }
            else {
                System.out.printf("%d, %d, %d \n", num3, num2, num1);                
            }
        }
        
        
        
        tc.close();
    }

}
