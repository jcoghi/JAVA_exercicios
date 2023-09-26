package aula0519.poo.enums.rpg;

public class Monstro {

    enum Monstros {

        SLIME("Slime", 2),
        ESQUELETO("Esqueleto", 5),
        ZUMBIE("Zumbie", 3);

        private String nome;
        private int hp;

        private Monstros(String nome, int hp) {
            this.nome = nome;
            this.hp = hp;
        }

        public String getNome() {
            return nome;
        }

        public int getHp() {
            return hp;
        }

    }

    public String nome;
    public int hp;

    public Monstro(Monstros bd) {
        this.nome = bd.getNome();
        this.hp = bd.getHp();      
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + "\nHP: " + hp;
    }
}
