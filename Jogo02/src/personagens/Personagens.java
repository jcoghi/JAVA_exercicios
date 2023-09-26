package personagens;

import dados.Dados;
import movimento.Direcao;

public abstract class Personagens {

    public int x;
    public int y;
    public Dados dado = new Dados();

    protected boolean andar(Direcao direcao, int x, int y) {
        if (x == 0) {
            if (y == 0) {
                switch (direcao) {
                    case CIMA:
                        y++;
                        break;
                    case DIREITA:
                        x++;
                        break;
                }
            } else {
                switch (direcao) {
                    case CIMA:
                        y++;
                        break;
                    case BAIXO:
                        y--;
                        break;
                    case DIREITA:
                        x++;
                        break;
                }
            }
        } else if (x != 0) {
            if (y == 0) {
                switch (direcao) {
                    case CIMA:
                        y++;
                        break;
                    case DIREITA:
                        x++;
                        break;
                    case ESQUERDA:
                        x--;
                        break;
                }
            } else {
                switch (direcao) {
                    case CIMA:
                        y++;
                        break;
                    case BAIXO:
                        y--;
                        break;
                    case DIREITA:
                        x++;
                        break;
                    case ESQUERDA:
                        x--;
                        break;
                }
            }
        }

        return true;
    }
}
