package aula0320;

import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        int num1, num2, min;
        System.out.println("Digite um numero");
        num1 = tc.nextInt();
        System.out.println("Digite outro numero");
        num2 = tc.nextInt();
        
        min = (num1 < num2)?num1:num2;
        
        System.out.println(min);
        
        tc.close();
    }
    
}
