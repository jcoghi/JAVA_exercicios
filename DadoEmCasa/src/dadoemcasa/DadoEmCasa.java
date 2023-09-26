package dadoemcasa;

import java.util.Random;
import java.util.Scanner;

public class DadoEmCasa {

    public static void main(String[] args) {
        int[] dado = {1, 2, 3, 4, 5, 6};
        boolean apostando = true;
        float carteiraInicial = 1000f;
        float aposta;
        Random numero = new Random();
        Scanner tc = new Scanner(System.in);

        while (apostando) {
            boolean jogando = true;
            if (carteiraInicial > 0) {
                System.out.println("Carteira: R$" + carteiraInicial);
                System.out.print("Quanto deseja apostar? ");
                aposta = tc.nextFloat();

                if (aposta > carteiraInicial) {
                    System.out.println("Carteira sem saldo para a aposta.");
                } else {

                    while (jogando) {
                        int dadoUm = dado[numero.nextInt(dado.length)];
                        int dadoDois = dado[numero.nextInt(dado.length)];
                        System.out.println(dadoUm + " " + dadoDois);
                        int soma = dadoUm + dadoDois;

                        switch (soma) {
                            case 2,9:
                                System.out.println("Soma " + soma + "\nJogador Ganhou R$" + aposta * 2);
                                carteiraInicial += aposta * 2;
                                jogando = false;
                                break;
                            case 6:
                                System.out.println("Soma " + soma + "\nJogador Perdeu R$" + aposta);
                                carteiraInicial -= aposta;
                                jogando = false;
                                break;
                            case 10:
                                System.out.println("Soma " + soma + "\nEmpatou. Jogador recuperou a aposta de R$" + aposta);
                                jogando = false;
                                break;
                        }
                    }
                }
            } else {
                System.out.println("Sem dinheiro em carteira");
                apostando = false;
            }
        }
        tc.close();
    }
}
