package novojogo;

import java.util.Scanner;
import static novojogo.Direcao.*;

public class Jogo {

    public static void main(String[] args) {

        Heroi heroi = new Heroi("Zezinho");
        Monstro monster = new Monstro(10,10);
        Scanner tc = new Scanner(System.in);
        
        heroi.setX(9);
        heroi.setY(10);
        System.out.println("Vida do heroi: " + heroi.getVida());
        System.out.println("Vida monstro: " + monster.getVida());
        
        heroi.ataque(monster);
        monster.ataque(heroi);
        System.out.println("Vida heroi: " + heroi.getVida());
        System.out.println("Vida monstro: " + monster.getVida());
        
        
        heroi.dormir();
        monster.dormir();     
        System.out.println("Vida heroi: " + heroi.getVida());
        System.out.println("Vida monstro: " + monster.getVida());
    }
}
