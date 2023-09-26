package personagens.monstros;

import dados.*;
import personagens.Personagens;

public class Paraelemental extends Personagens {

    String nome = "Paraelemental";
    Dados dado = new Dados();

    int vida = 2 * dado.d8();

    public int ataque() {
        return dado.d4();
    }

    public int defesa() {
        return dado.d4();
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

}
