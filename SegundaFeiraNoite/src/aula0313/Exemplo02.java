package aula0313;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        char letra;
        String texto;
        /* 0 1 2 3 4 5 6
         * J A M E L Ã O
        */
        texto = tc.next();
        letra = texto.charAt(5);
        
        System.out.println(letra);
        
    }
    
}
