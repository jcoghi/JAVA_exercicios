package rpg.heroi;

import rpg.Dados;

public class Heroi {

    String nome;
    int vida;
    int ataque;
    int defesa;
    Dados dado;

    public int dado(int numeroFaces) {
    dado = new Dados(numeroFaces);
        return dado.getFaceDado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }
    
    public void dano( int dano) {
        this.vida -= dano;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setAtributos(int ataque, int defesa, int vida) {
        this.ataque = ataque;
        this.defesa = defesa;
        this.vida = vida;
    }

    public boolean fuga() {
        double aleatorio = Math.random();
        if (aleatorio > 0.7) {
            return true;
        }
        return false;
    }
}
