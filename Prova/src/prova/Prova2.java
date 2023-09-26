package prova;

import java.util.Scanner;

public class Prova2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String[] cestaFrutas = {"Maçã", "Banana", "Mamão", "Abacate", "Morango"};

        System.out.print("Digite uma fruta: ");
        String entrada = teclado.nextLine();

        for (String fruta: cestaFrutas) {
            if (entrada.equalsIgnoreCase(fruta)) {
                System.out.println("A fruta" + entrada + " foi encontrada.");
                break;
            }
        }
    }
}
