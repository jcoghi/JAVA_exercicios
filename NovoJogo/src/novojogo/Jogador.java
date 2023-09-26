package novojogo;

import static novojogo.Direcao.*;

public abstract class Jogador {

    // ATRIBUTOS
    private String nome;
    private int vida = 100;
    private int x;
    private int y;

    // CONSTRUTOR
    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // MÉTODOS    
    public boolean ataque(Jogador oponente) {
        int deltaX = Math.abs(this.x - oponente.x);
        int deltaY = Math.abs(this.y - oponente.y);
        
        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        }
        return false;
    }

    public boolean andar(Direcao direcao) {
        switch (direcao) {
            case CIMA:
                y++;
                break;
            case BAIXO:
                y--;
                break;
            case ESQUERDA:
                x--;
                break;
            case DIREITA:
                x++;
                break;
        }
        return true;
    }

    public void dormir() {
        this.vida += 20;
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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
