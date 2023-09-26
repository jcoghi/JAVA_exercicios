package aula0323;

import java.util.Scanner;

public class Exemplo10 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        int num1 = tc.nextInt();
        System.out.println("Digite outro numero:");
        int num2 = tc.nextInt();
        
        if(num1 < num2) {
            System.out.println(num1 + " é o menor");
        } else if (num1 == num2) {
            System.out.println("Sao iguais");
        } else {
            System.out.println(num2 + " é o menor");
        }

        tc.close();
    }
}
