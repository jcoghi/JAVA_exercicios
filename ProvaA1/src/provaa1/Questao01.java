package provaA1;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int colisoes = 0;
        int[] vetor = new int[10];
        boolean[] posicoesPreench = new boolean[10];

        for (int a = 0; a < 10; a++) {
            System.out.print("Digite o " + (a + 1) + " número inteiro: ");
            int num = scanner.nextInt();
            int posicao = num % 10;

            if (!posicoesPreench[posicao]) {
                vetor[posicao] = num;
                posicoesPreench[posicao] = true;
            } else {
                colisoes++;
                vetor[posicao] = num;
            }
        }

        System.out.println("\nPosicoes preenchidas e seus valores:");
        for (int a = 0; a < 10; a++) {
            if (posicoesPreench[a]) {
                System.out.println("Posicao " + a + ": " + vetor[a]);
            }
        }

        System.out.println("\nPosicoes não preenchidas:");
        for (int a = 0; a < 10; a++) {
            if (!posicoesPreench[a]) {
                System.out.println("Posicao " + a);
            }
        }

        System.out.println("\nNúmero de colisões: " + colisoes);
    }
}
