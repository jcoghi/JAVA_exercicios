package segundafeiravo;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        String opcaoString;
        char opcaoChar;
        boolean rodando = true;
        Scanner teclado = new Scanner(System.in);
        while (rodando) {
            System.out.println("Você deseja continuar? [S/N]");
            opcaoString = teclado.next().toLowerCase();
            opcaoChar = opcaoString.charAt(0);
            // n - 110 e s - 115

            switch (opcaoChar) {
                case 110:
                    System.out.println("Fechando...");
                    rodando = false;
                    break;
                case 115:
                    System.out.println("Insira o primeiro número");
                    double numeroUm = teclado.nextDouble();
                    System.out.println("Insira o primeiro número");
                    double numeroDois = teclado.nextDouble();
                    System.out.printf("A soma de %.2f com %.2f é %.2f", numeroUm,
                            numeroDois, numeroDois + numeroUm);
                default:
                    System.out.println("Insira uma opção válida");
            }
            teclado.close();
        }
    }
}
