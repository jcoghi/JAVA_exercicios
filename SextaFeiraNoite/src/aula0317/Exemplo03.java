package aula0317;

import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double altura, peso;
        String sexo;

        System.out.println("Altura?");
        altura = tc.nextDouble();

        System.out.println("Sexo biologico:");
        sexo = tc.next().toLowerCase();

        switch (sexo) {
            case "m":
                peso = 72.7 * altura - 58;
                System.out.printf("Peso ideal = %.2f\n", peso);
                break;
            case "f":
                peso = 62.1 * altura - 44.7;
                System.out.printf("Peso ideal = %.2f\n", peso);
                break;
            default:
                System.out.println("Opcao Invalida");
        }

        tc.close();
    }

}
