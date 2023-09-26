package listafor;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        int entrada = teclado.nextInt();
        int fatorial = 1;

        for (int i = entrada; i > 0; i--) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
