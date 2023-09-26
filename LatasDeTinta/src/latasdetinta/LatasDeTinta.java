package latasdetinta;

import java.util.Scanner;

public class LatasDeTinta {

    public static void main(String[] args) {
        final float CAPACIDADE = 5.5f;
        Scanner teclado = new Scanner(System.in);
        float comprimento,
                largura,
                parcial;
        int resultado;

        System.out.println("Qual o comprimento da parede: ");
        comprimento = teclado.nextFloat();

        System.out.println("Qual a largura da parede: ");
        largura = teclado.nextFloat();

        parcial = (comprimento * largura) / CAPACIDADE;

        if ((comprimento * largura) % CAPACIDADE == 0) {
            resultado = (int) parcial;
            System.out.println("São necessárias " + resultado + " latas de tinta"
                    + " para pintar " + comprimento * largura + "m²");
        } else {
            resultado = (int) parcial + 1;
            System.out.println("São necessárias " + resultado + " latas de tinta"
                    + " por demão");
        }
    }

}
