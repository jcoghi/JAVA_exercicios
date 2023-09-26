package aula0317;

import java.util.Scanner;
// conversão de temperatura: Celsius -> Fahrenheit
public class Exemplo03 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        double f, c;
        
        System.out.println("Insira temp em Celsius:");
        c = tc.nextDouble();
        
        f = (c * 9)/5 + 32; // c * 9.0/5 + 32
        System.out.println("Temp em Fahrenheit = " + f);
        
        tc.close();
    }
    
}
