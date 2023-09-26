package rpg.vilao;

import java.util.Random;
import rpg.Dados;

public class Vilao {

    String nomes[] = {"Abaddon", "Vex", "Ditch", "Gambit", "Flint", "Magnus"};
    int vidas[] = {50, 60, 70, 80, 90, 100};
    Random aleatorio = new Random();
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private Dados dado;

    public String setNome() {

        this.nome = nomes[aleatorio.nextInt(nomes.length)];
        this.vida = vidas[aleatorio.nextInt(vidas.length)];
        return this.nome;
    }

    public int getDado() {
        dado = new Dados(12);
        return dado.getFaceDado();
    }

    public int vida() {
        return this.vida;
    }

    public void setVida(int dano) {
        this.vida = dano;
    }

    boolean defenderOuAtacar() {
        return aleatorio.nextBoolean();
    }

}
