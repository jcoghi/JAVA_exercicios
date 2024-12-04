import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();
        Personagem monstro = new Personagem();
        Scanner tc = new Scanner(System.in);
        Random dado = new Random();
        boolean encontro = true;

        System.out.print("Nome do heroi: ");
        heroi.nome = tc.next();
        heroi.vida = 100;

        monstro.nome = "Esqueleto";
        monstro.vida = dado.nextInt(50, 70);

        while (encontro) {
            System.out.println("Deseja [1]lutar ou [2]fugir? ");
            int lutaOuFuga = tc.nextInt();
            heroi.ataque = dado.nextInt(1, 20);
            heroi.defesa = dado.nextInt(1, 10);
            monstro.ataque = dado.nextInt(1, 12);
            monstro.defesa = dado.nextInt(1, 12);
            // Luta
            if (lutaOuFuga == 1) {
                if (heroi.vida > 0 && monstro.vida > 0) {
                    heroi.Luta(monstro);
                    System.out.println("********");
                    monstro.Luta(heroi);
                    System.out.println("********");
                } else if (monstro.vida == 0) {
                    System.out.println(heroi.nome + " Ganhou a batalha.");
                    lutaOuFuga = 0;
                } else if (heroi.vida <= monstro.vida) {
                    lutaOuFuga = heroi.Fuga(monstro);
                }

                // Fuga
            } else if (lutaOuFuga == 2) {
                lutaOuFuga = heroi.Fuga(monstro);
                encontro = false;
            } else {
                System.out.println("Insira uma opção válida");
            }
        }


        tc.close();
    }

}