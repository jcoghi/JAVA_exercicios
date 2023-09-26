package personagens.monstros;

import dados.*;
import personagens.Personagens;

public class Aballin extends Personagens {

    String nome = "Aballin";
    Dados dado = new Dados();
    
    int vida = 3 *dado.d10();
    
    public int ataque() {
        return dado.d8() + 7;
    }
    
    public int defesa() {
        return dado.d6();
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
