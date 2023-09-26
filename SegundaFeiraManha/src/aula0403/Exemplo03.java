/*
 * Faça um programa para gerar, aleatoriamente, os lados de um dado
 * de 6 faces
*/
package aula0403;

import java.util.Scanner;

public class Exemplo03 {
    
    public static void main(String[] args) {
        
        boolean ligado = true;
        char continuar;
        Scanner tc = new Scanner(System.in);
        
        while (ligado) {
            int dado1 = (int)(Math.random() *6) + 1;
            int dado2 = (int)(Math.random() *6) + 1;
            int soma = dado1 + dado2;
            System.out.printf("%d + %d = %d \n", dado1
                    ,dado2,soma);
            switch (soma) {
                case 2:
                case 7:
                    System.out.println("Jogador venceu esta roada");
                    System.out.println("Deseja jogar novamente?[S]/[N]");
                    continuar = tc.next().toLowerCase().charAt(0);
                    if (continuar == 'n') {
                        ligado = false;
                    }   break;
                case 10:
                    System.out.println("Empatou, nem voce perdeu, "
                            + "nem eu ganhei");
                    System.out.println("Deseja jogar novamente?[S]/[N]");
                    continuar = tc.next().toLowerCase().charAt(0);
                    if (continuar == 'n') {
                        ligado = false;
                    }   break;
                case 6:
                    System.out.println("Perdeu prayboy!!");
                    System.out.println("Deseja jogar novamente?[S]/[N]");
                    continuar = tc.next().toLowerCase().charAt(0);
                    if (continuar == 'n') {
                        ligado = false;
                    }   break;
                default:
                    break;
            }
        }
 
        tc.close();
    }
}
 /*
Agora, vocês devem fazer a criação de 2 dados de 6 faces e criar
o seguinte jogo:
Se a soma dos dois dados for 2 ou 7 -> O jogador ganha a aposta;
Se a soma dos dois dados for 10 -> ninguém vence;
Se a soma dos dois dados for 6 -> A banca ganha e o jogador perde;
Qualquer outro resultado, os dados devem ser rerrolado automaticamente
*/