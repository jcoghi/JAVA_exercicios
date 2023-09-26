package aula0324;

import java.util.Scanner;

public class Exemplo04a {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double saldo = 0, media;
        int contador;

        for (contador = 0; contador < 3; contador++) {
            System.out.println("Informe seu saldo:");
            saldo += tc.nextDouble();
        }
        System.out.printf("Media = %.2f / %d \n", saldo, contador);
        media = saldo / contador;

        System.out.printf("A media ficou em R$ %.2f \n", media);

        if (media > 0 && media <= 500) {
            System.out.println("Sem credito no mercado \n");
        } else if (media > 500 && media <= 1000) {
            System.out.printf("Seu credito esta em R$ %.2f \n", (0.3 * media));
        } else if (media > 1000 && media <= 3000) {
            System.out.printf("Seu credito esta em R$ %.2f \n", (0.4 * media));
        } else if (media > 3000) {
            System.out.printf("Seu credito esta em R$ %.2f \n", (0.5 * media));
        } else {
            System.out.println("Verifique os valores e tente novamente");
        }

        tc.close();
    }
}
