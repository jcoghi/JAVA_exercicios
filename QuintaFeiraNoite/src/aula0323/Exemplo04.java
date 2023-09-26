package aula0323;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int num;
        
        System.out.println("Digite um numero:");
        num = tc.nextInt();
        
        if (num >= 0 && num % 2 == 0) {
            System.out.println("Positivo e Par");
        }else if (num >= 0 && num % 2 != 0 ){
            System.out.println("Positivo e Impar");
        } else if(num < 0 && num % 2 == 0) {
            System.out.println("Negativo e Par");
        }else{
            System.out.println("Negativo e Impar");
        }
        
        tc.close();         
    }
}
