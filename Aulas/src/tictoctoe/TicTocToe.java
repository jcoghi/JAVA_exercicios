package tictoctoe;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class TicTocToe {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        String telaInicial = """
                    1   2   3
                  |---|---|---|
                1 |   |   |   |
                  |---|---|---|
                2 |   |   |   |
                  |---|---|---|
                3 |   |   |   |
                  |---|---|---|
                """;
        boolean inicio = true;

        try {
            while (inicio) {
                System.out.println("Selecione: \n1 - solo \n2- 2 jogadores");
                int tipoJogo = tc.nextInt();
                int[][] jogada = new int[1][1];
                System.out.println(telaInicial);

                switch (tipoJogo) {
                    case 1 -> {
                        inicio = false;
                        jogar(tc, inicio);
                    }
                    case 2 -> {
                        inicio = false;
                        jogar(tc, inicio);
                    }
                    default ->
                        System.out.println("Opção inválida");
                }
            }
        } catch (InputMismatchException ie) {
            System.out.println("opção inválida");
        }
    }

    public static String tela(String jogador, int[] jogada) {  
          String tela = "";
        String[][] matriz = new String[8][4];
        
        matriz[0][0] = "     "; matriz[0][1] = " 1    "; matriz[0][2] = "  2     "; matriz[0][3] = " 3 ";
        matriz[1][0] = "  |"; matriz[1][1] = "------|"; matriz[1][2] = "------"; matriz[1][3] = "|-------|";        
        matriz[2][0] = "1 |"; matriz[2][1] = "\t |"; matriz[2][2] = "\t|"; matriz[2][3] = "\t|";
        matriz[3][0] = "  |"; matriz[3][1] = "------|"; matriz[3][2] = "------"; matriz[3][3] = "|-------|";
        matriz[4][0] = "2 |"; matriz[4][1] = "\t |"; matriz[4][2] = "\t|"; matriz[4][3] = "\t|";
        matriz[5][0] = "  |"; matriz[5][1] = "------|"; matriz[5][2] = "------"; matriz[5][3] = "|-------|";
        matriz[6][0] = "3 |"; matriz[6][1] = "\t |"; matriz[6][2] = "\t|"; matriz[6][3] = "\t|";
        matriz[7][0] = "  |"; matriz[7][1] = "------|"; matriz[7][2] = "------"; matriz[7][3] = "|-------|";

        for(int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                
                if(l == jogada[0] && c == jogada[1]) { 
                    tela += "  " +  matriz[l+1][c+1] + " |";
                } else {
                tela += matriz[l][c];
                }
            }
            tela += "\n";
        }
        
        return tela;
    }

    public static void jogar(Scanner teclado, boolean inicio) {
        int jogador1 = 1, jogador2 = 0, aux;
        int[] jogada = new int[2];
        int[] jogadores = new int[2];
        String tela;
        if (inicio != true) {
            System.out.println("Selecione a linha desejada:");
            int linha = teclado.nextInt();
            System.out.println("Selecione a coluna desejada:");
            int coluna = teclado.nextInt();
            jogada[0] = linha;
            jogada[1] = coluna;
            
            tela = (jogador1 == 1)? tela(" x ", jogada) : tela(" O ", jogada);
            
            jogadores = mudarJogador(jogador1, jogador2);
            jogador1 = jogadores[0];
            jogador2 = jogadores[1];
            
            System.out.println(tela);
        }
    }
    
    public static int[] mudarJogador(int jogador1, int jogador2) {
        int  aux;
        aux = jogador1;
        jogador1 = jogador2;
        jogador2 = aux;
        int[] jogadores = new int[]{jogador1, jogador2};
        return jogadores;
    }

}
