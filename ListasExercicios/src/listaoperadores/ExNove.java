/*
 Faça um programa que calcula a área de uma circunferência 
 com precisão de 2 casas decimais.
*/

package listaoperadores;

import java.util.Scanner;
//import java.lang.Math;

public class ExNove {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float raio;
        float area;
        final float PI = (float) Math.PI;
        
        System.out.print("Entre com o raio de uma circunferencia: ");
        raio = teclado.nextFloat();
        
        area = (float)(2 * PI * Math.pow(raio, 2));
        
        System.out.printf("Area = %.2f", area);
        teclado.close();
    }
}
