package testandoArray;

import java.util.Random;

public class Monstro {
    String[] nomes = {"Slime", "Esqueleto", "Zumbie"};
    String nome;
    Random gerador = new Random();

    public Monstro() {
        this.nome = nomes[gerador.nextInt(3)];
    }
}
