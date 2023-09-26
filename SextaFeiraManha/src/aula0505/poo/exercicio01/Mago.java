package aula0505.poo.exercicio01;

import java.util.Random;

public class Mago extends Aventureiro {

//    ATRIBUTO
    private int mana = 10;

    public Mago(String nome, int vida, boolean atacavel) {
        super(nome, vida, atacavel);
    }

    public int bolaDeFogo(int mana) {
        if (mana >= 4) {
            mana -= 4;
            Random gerador = new Random();
            return gerador.nextInt(6) + 3;
        }
        return 0;
    }
}
