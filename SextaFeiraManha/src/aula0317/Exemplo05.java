package aula0317;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        double raio, area;

        System.out.println("Informe o raio da circunferencia:");
        raio = tc.nextDouble();

        area = Math.PI * Math.pow(raio, 2);
        
        System.out.printf("area = %.2f", area);
        System.out.println("");
        tc.close();
    }
    
}
