package aula0324;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        char nome = tc.next().toLowerCase().charAt(0);
        
        System.out.println(nome);
        tc.close();
        
    }
    
}
