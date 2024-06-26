package TesteAula1106;

/**
 * @author prof. João Felipe F. Coghi
 */
public enum Monstros {
    ESQUELETO("Esqueleto", 6, 6, 6),
    GOBLIN("Goblin", 5, 7, 8),
    SLIME("Slime", 2, 2, 1),    
    ZUMBIE("Zumbie", 14, 4, 5);
    
    private String nome;
    private int vida;
    private int forca;
    private int defesa;

    private Monstros(String nome, int vida, int forca, int defesa) {
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
