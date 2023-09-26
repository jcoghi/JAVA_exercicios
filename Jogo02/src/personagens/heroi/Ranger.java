package personagens.heroi;

import dados.Dados;

public class Ranger extends Heroi {
    int vida = 12;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Dados getDado() {
        return dado;
    }

    public void setDado(Dados dado) {
        this.dado = dado;
    }
    
}
