package personagens.monstros;

import dados.*;
import personagens.Personagens;

public class Splicante extends Personagens {

    String nome = "Suplicante";
    Dados dado = new Dados();

    int vida = 2 * dado.d8() + 8;

    public int ataque() {
        return dado.d4() + 5;
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
