package aula0518.enums.rpg;

public class Main {

    public static void main(String[] args) {
        Monstro[] monstros = new Monstro[3];
        int i = 0;
        for (Monstro.Nomes nomes: Monstro.Nomes.values()) {
            monstros[i] = new Monstro(nomes);
            i++;
        }
        for (int a = 0; a < monstros.length; a++) {
            System.out.println(monstros[a].toString() + "\n");
        }
    }

}
