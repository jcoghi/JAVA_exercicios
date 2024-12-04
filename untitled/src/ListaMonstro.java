public enum ListaMonstro {
    SLIME("Slime", 2),
    ESQUELETO("Esqueleto", 5),
    ZUMBIE("Zumbie", 3);

    private String nome;
    private int hp;

    ListaMonstro(String nome, int hp){
        this.nome = nome;
        this.hp = hp;
    }

    public String getName() {
        return nome;
    }

    public int getHp() {
        return hp;
    }

}
