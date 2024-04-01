package TesteAula1106;

/**
 *
 * @author prof. João Felipe F. Coghi
 */
public enum Herois {
    WARRIOR("Conan", 20, (int) (Math.random() * 10)+5, (int) (Math.random() * 10)+5),
    ARCHER("Legolas", 15, (int) (Math.random() * 8)+5, (int) (Math.random() * 8)+5),
    MAGE("Harry", 10, (int) (Math.random() * 6)+5, (int) (Math.random() * 6)+5);
    
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
