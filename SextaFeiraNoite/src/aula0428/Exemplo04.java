package aula0428;

import java.util.Scanner;

public class Exemplo04 {
    
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        try {
            System.out.println("Digite um num:");
            int lado1 = tc.nextInt();
            System.out.println("Digite outro num:");
            int lado2 = tc.nextInt();
            System.out.println("Area = " + area(lado1));
            System.out.println("Area = " + area(lado1,lado2));
            
            
            
        } catch (Exception e) {
            System.out.println("Digitou errado");
        }
        
        
    }
    
    public static int area(int lado) {
        return lado * lado;
    }  
    
    public static int area(int base, int altura) {
        return base * altura;
    }  

}
