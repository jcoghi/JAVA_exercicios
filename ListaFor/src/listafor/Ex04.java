package listafor;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Número para tabuada: ");
        int entrada = teclado.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d \n", 
                    entrada, i, entrada * i);
        }
    }

}
