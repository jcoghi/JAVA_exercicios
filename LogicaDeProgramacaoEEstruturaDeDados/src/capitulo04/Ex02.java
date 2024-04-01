/*
 * A velocidade média de um veículo é dado pela expressão: Vm = dS / dT;
 * Faça um programa que calcule a velocidade média
 */
package capitulo04;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class Ex02 {
    public static void main(String[] args) {
        float dS, vm, dT;
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Informe a distância percorrida");
        dS = tc.nextFloat();
        System.out.println("Informe em quanto tempo foi percorrida a distância de " + dS + "km:");
        dT = tc.nextFloat();
        
        vm = dS/dT;
        System.out.printf("Velocidade médida de %.2f km/h\n", vm);
    }
}
