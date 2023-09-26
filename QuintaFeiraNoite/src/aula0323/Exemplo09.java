package aula0323;

import java.util.Scanner;

public class Exemplo09 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        int num1, num2, menor;
        
        System.out.println("Digite o primeiro numero:");
        num1 = tc.nextInt();
        System.out.println("Digite o segundo numero");
        num2 = tc.nextInt();
        
        menor = (num1>num2)?num2:num1;

        System.out.println(menor + " é o menor numero digitado");
        
        tc.close();
    }  
}
