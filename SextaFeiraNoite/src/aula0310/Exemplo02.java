/*
Converter a temperatura de Celsius para Fahrenheit
        F = C * (9/5) + 32
 */
package aula0310;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double tempCelsius, tempFahrenheit;
        
        System.out.println("Digite uma temperatura em Celsius:");
        tempCelsius = teclado.nextDouble();
        
        tempFahrenheit = (tempCelsius * 9.0/5) + 32;
        System.out.println("Temp: " + tempFahrenheit);
    }
}
