public class Jogo {
    public static void main(String[] args) {

        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();

        j1.x = 1;
        j1.y = 1;

        j2.x = 1;
        j2.y = 0;

        System.out.println(j1.vida);
        j1.atacar(j2);
        System.out.println(j2.vida);
    }
}