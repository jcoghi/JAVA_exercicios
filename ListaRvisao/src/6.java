package prova01;

import java.util.Scanner;

public class Prova01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int linha, coluna = 0, resultado;
        int conta = 0, conta1 = 0;
        int vetor[][] = new int[2][2];
        for (linha = 0; linha < 2; linha++) {
            for (coluna = 0; coluna < 2; coluna++) {
                System.out.println("Digite os numeros: ");
                vetor[linha][coluna] = entrada.nextInt();
            }
        }
        conta = (coluna[1]*linha[2]);
        conta1 = (coluna[2]*linha[1]);
        resultado = conta-conta1;
        for (linha = 0; linha<2; linha++){
            for (coluna = 0; coluna <2; coluna++){
                System.out.println("O numero na linha "+(linha+1)+" e na coluna "+ (coluna+1)
                +" é: "+vetor[linha][coluna]);
            }
        }
        System.out.println("O resultado da sua determinante é: "+resultado);
    }
}
