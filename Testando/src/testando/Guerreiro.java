package testando;

import java.util.Random;

public class Guerreiro {

    String nome;
    int vida = 20;
    private Random num = new Random();
    int ataque = num.nextInt(1, 20);
    int defesa = num.nextInt(1, 12);
}
