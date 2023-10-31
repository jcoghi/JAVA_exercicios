package gui.rpg.monstros;

/**
 * @author prof. João Felipe F. Coghi
 */
public enum Monstros {
    SLIME("Slime", 5, 2, 1),
    ESQUELETO("Esqueleto", 5, 3, 2),
    ZUMBIE("Zumbie", 8, 3, 3);
    
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
