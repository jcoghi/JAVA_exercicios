package aula0324;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int num;
        
        System.out.println("Digite um numero");
        num = tc.nextInt();
        
        if (num % 10 == 0 || num % 5 == 0 || num % 2 == 0) {
            System.out.println("Divisivel por 10, ou por 5, ou por 2");
        } else {
            System.out.println("Nao eh divisivel por 10, nem por 5 e nem por 2");
        }
        
        tc.close();
    }
}
