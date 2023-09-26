package aula0317;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args){
        
        Scanner tc = new Scanner(System.in);
        int a, b, c, soma;
        
        System.out.println("Digite um numero:");
        a = tc.nextInt();
        
        System.out.println("Digite outro numero:");
        b = tc.nextInt();
        
        System.out.println("Digite outro numero:");
        c = tc.nextInt();
        
        soma = a + b + c;
        System.out.printf("%d + %d + %d = %d\n",a,b,c,soma);
        
        tc.close();
        
    }
}
