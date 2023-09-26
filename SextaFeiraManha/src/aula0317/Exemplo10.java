package aula0317;

import java.util.Scanner;

public class Exemplo10 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero:");
        num = tc.nextInt();

        if (num % 2 == 0 && num >= 0) {
            System.out.println("Par e Positivo");
        } else if (num % 2 == 0 && num < 0) {
            System.out.println("Par e Negativo");
        } else if (num % 2 != 0 && num >= 0) {
            System.out.println("Impar e Positivo");
        } else {
            System.out.println("Impar e Negativo");
        }

        tc.close();
    }

}
