package aula0518.enums.rpg;

public class Monstro {

    public enum Nomes {
        GARGULA("Gargula", 10, 5),
        SLIME("Slime", 2, 1),
        ESQUELETO("Esqueleto", 3, 3);

        private final String nome;
        private final int hp;
        private final int atk;

        Nomes(String nome, int hp, int atk) {
            this.nome = nome;
            this.hp = hp;
            this.atk = atk;
        }

        public int getHp() {
            return this.hp;
        }
        
        public int getAtk() {
            return this.atk;
        }

        public String getNome() {
            return this.nome;
        }
    }

    String nome;
    int hp;
    int atk;

    public Monstro(Nomes nome) {
        this.nome = nome.getNome();
        this.hp = nome.getHp();
        this.atk = nome.getAtk();
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nHP: " + this.hp + "\nAtaque: " + this.atk;
    }
}
