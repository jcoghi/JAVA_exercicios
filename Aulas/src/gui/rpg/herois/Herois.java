package gui.rpg.herois;

/**
 *
 * @author prof. João Felipe F. Coghi
 */
public enum Herois {
    WARRIOR("Conan", 15, 5, 3),
    ARCHER("Legolas", 10, 3, 2),
    MAGE("Harry", 8, 2, 3);
    
    private String nome;
    private int vida;
    private int forca;
    private int defesa;

    private Herois(String nome, int vida, int forca, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public int getDefesa() {
        return defesa;
    }
}
