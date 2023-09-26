package aula0515.calculadoratrigonometrica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Informe um angulo em graus:");
        float angulo = tc.nextFloat();
        Calculadora calc = new Calculadora(angulo);
        float radianos = calc.radianos(angulo);
        calc.resultados(radianos);
    }
    
}
