/*
 * 5. Usuário deve inserir a temperatura em °C e imprima a temperatura em °F:
 */
package aula0306;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        float tempCelsius, tempFanherit;
        
        System.out.println("Entre com uma temperatura em °C");
        tempCelsius = tc.nextFloat();
        
        tempFanherit = tempCelsius * (9.0f/5) + 32;
        
        System.out.printf("Tempatura de %.2f °F\n", tempFanherit);
        
    }
}
