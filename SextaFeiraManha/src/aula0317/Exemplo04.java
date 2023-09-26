package aula0317;
// Insere a velocidade em km/h -> velocidade em m/s

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        double metros, quilometros;
        
        System.out.println("Velocidade em km/h?");
        quilometros = tc.nextDouble();
        
        metros = quilometros / 3.6;
        System.out.println("Velocidade = " + metros + " m/s");
        System.out.printf("Velocidade = %.2f m/s\n", metros);
        tc.close();
    }
    
}
