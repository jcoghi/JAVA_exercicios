package jogoenum;

import java.util.Random;

public class Jogo {

    public static void main(String[] args) {

        Jogador heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 10;

        Random num = new Random();

        int x = num.nextInt(10);
        int y = num.nextInt(10);
        Jogador monstro = new Monstro(x, y);
        
        monstro.x = 9;
        monstro.y = 10;

        System.out.println("J1 vida: " + heroi.vida);
        heroi.atacar(monstro);
        System.out.println("J1 vida: " + monstro.vida);
    }

}
