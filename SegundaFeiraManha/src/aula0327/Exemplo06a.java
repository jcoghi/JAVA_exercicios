
package aula0327;

import java.util.Scanner;

public class Exemplo06a {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);  
        int num, par = 0, impar = 0;
        
        for(int i = 0; i < 10 ; i++) {
            
            System.out.println("\nDigite o número:  ");
            num = scan.nextInt();
            
            int condition = (num % 2 == 0 ) ? par++ : impar++;
        }
        
        System.out.println("\nDos 10 números digitados, \n" + par + 
            " são números pares e " + impar + " são números ímpares \n");
    }
}
