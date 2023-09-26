package principal;

import personagens.heroi.Ranger;
import java.util.Scanner;
import personagens.heroi.*;
import personagens.monstros.*;

public class Principal {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        Ranger jogador = new Ranger();
        
        System.out.println("Qual o gênero do personagem? ");
        jogador.dado.d10();
        
        tc.close();
        
    }
}
