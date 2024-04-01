package tictoctoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        try{
        
        
        System.out.println("Selecione: \n1 - solo \n2- 2 jogadores");
        int tipoJogo = tc.nextInt();
        int[][] jogada =new int[1][1];
        
        System.out.println(tela(0,0,jogada));
        
        }catch(InputMismatchException ie) {
            System.out.println("opção inválida");
        }
    }

    
    
    public static String tela(int status,int jogador, int jogada[][]) {
        String[][] tabuleiro = new String[][] {["|\t|\t|\t|"],["|____|____|____|"]};
        
        
        switch(status) {
            case 0: return """
                |       |       |       |
                |-------|-------|-------|
                |       |       |       |
                |-------|-------|-------|
                |       |       |       |
                """;
            
            case 1:
            
            default: return """
                |       |       |       |
                |-------|-------|-------|
                |       |       |       |
                |-------|-------|-------|
                |       |       |       |
                """;
        }
    }
}
