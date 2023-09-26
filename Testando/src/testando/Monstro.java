package testando;

import java.util.Random;

public class Monstro {
    String nome; 
    int vida = 20;
    private Random num = new Random();
    int ataque = num.nextInt(1, 12);
    int defesa = num.nextInt(1, 6);
}
