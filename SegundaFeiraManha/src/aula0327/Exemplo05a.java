package aula0327;

import java.util.Scanner;

public class Exemplo05a {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        int acumulador = 0, contador = 1;

        for (int i = 1;;) {
            System.out.println("Insira -1 para sair do programa e "
                    + "visualizar a media das idades");
            System.out.println("Informe uma idade: ");
            int auxiliar = tc.nextInt();
// Condição de saída do FOR
            if (auxiliar == -1) {
                break;
            } else {
                acumulador += auxiliar;
                contador++;
            }
        }

        System.out.println("Média = " + (double)acumulador / contador);
        tc.close();
    }

}
