package aula0324;

import java.util.Scanner;

public class SwitchRule {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int idade;
        
        System.out.println("digite sua idade:");
        idade = tc.nextInt();
        
        switch (idade) {
            case 10 -> {
                System.out.println("Você ainda é um bebezão.");
                System.out.println("Vai lá chorar para a mamãe.");
            }
            case 20 -> {
                System.out.println("Você acha que já é adulto?");
                System.out.println("kkkkkkkkkkk... Nem a pau");
            }
            case 30 -> {
                System.out.println("Ainda acha que é jovem, mas já passou da"
                        + " hora de virar adulto.");
                System.out.println("Vê se cresce!!");
            }
            default-> {
                System.out.println("Você não está nem na brincadeira.");
                System.out.println("kkkkk.... perdeu playboy!!");
            }
        }

        tc.close();
    }
}
