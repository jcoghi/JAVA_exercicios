public class Monstro {
    private String nome;
    private int hp;

    public Monstro(ListaMonstro dataBase) {
        this.nome = dataBase.getName();
        this.hp = dataBase.getHp();
    }

    @Override
    public String toString() {
        return "nome= '" + nome + '\'' +
                ", hp= " + hp;
    }
}
