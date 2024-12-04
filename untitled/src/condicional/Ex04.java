package condicional;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        int prato, sobremesa, bebida, refeicao;

        System.out.println(" *** SELEÇÃO DE PRATOS ***\n"+
                "1 - VEGETARIANO: 180 CAL\n"+
                "2 - PEIXE: 230 CAL\n"+
                "3 - FRANGO: 250 CAL\n"+
                "4 - CARNE: 350 CAL\n"+
                "SELECIONE A OPÇÃO DESEJADA:");
        prato = tc.nextInt();
        switch (prato) {
            case 1-> prato = 180;
            case 2 -> prato = 230;
            case 3 -> prato = 250;
            case 4 -> prato = 350;
            default -> System.out.println("Opção de prato inválida");
        }

        System.out.println(" *** SELEÇÃO DE SOBREMESA ***\n"+
                "1 - ABACAXI: 75 CAL\n"+
                "2 - SORVETE diet: 110 CAL\n"+
                "3 - MOUSE diet: 170 CAL\n"+
                "4 - MOUSE CHOCOLATE: 200 CAL\n"+
                "SELECIONE A OPÇÃO DESEJADA:");
        sobremesa = tc.nextInt();
        switch (sobremesa) {
            case 1-> sobremesa = 75;
            case 2 -> sobremesa = 110;
            case 3 -> sobremesa = 170;
            case 4 -> sobremesa = 200;
            default -> System.out.println("Opção de prato inválida");
        }

        System.out.println(" *** SELEÇÃO DE SOBREMESA ***\n"+
                "1 - CHÁ: 20 CAL\n"+
                "2 - SUCO DE LARANJA: 70 CAL\n"+
                "3 - SUCO DE LIMÃO: 100 CAL\n"+
                "4 - REFRIGERANTE diet: 65 CAL\n"+
                "SELECIONE A OPÇÃO DESEJADA:");
        bebida = tc.nextInt();
        switch (bebida) {
            case 1-> bebida = 20;
            case 2 -> bebida = 70;
            case 3 -> bebida = 100;
            case 4 -> bebida = 65;
            default -> System.out.println("Opção de prato inválida");
        }
        refeicao = prato + sobremesa + bebida;
        System.out.println("A refeição escolhida possui " + refeicao + " calorias");
        tc.close();
    }
}
