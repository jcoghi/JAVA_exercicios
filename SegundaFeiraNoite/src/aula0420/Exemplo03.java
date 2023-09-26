package aula0420;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        try {
            System.out.println("Digite um numero inteiro:");
            int num = tc.nextInt();
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Digite um numero, idiota");
        } 
    }
    
}
