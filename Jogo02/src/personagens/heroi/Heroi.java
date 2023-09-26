package personagens.heroi;

import personagens.Personagens;


public abstract class Heroi extends Personagens {
    private String nome;
    private String genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

     
}
