package aula0320;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        int a = 5, b = 4, c = 3, d = 6;
        
        System.out.println("(a > c) AND (c <= d): " + ((a > c) && (c <= d)));
        
        System.out.println("(a + b) > 10 OU (A + b) == (c + +d): " + 
                ((a + b) > 10 || (a + b) == (c + +d)));        
        
        tc.close();
    }    
}
