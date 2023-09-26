package jogoenum;

import static jogoenum.Direcao.NORTE;

public class Jogador {

    protected int vida = 100;
    protected int x;
    protected int y;
    
    Jogador (int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        }
        return false;
    }

    boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                y++;
            case SUL:
                y--;
            case LESTE:
                x++;
            case OESTE:
                x--;
        }
        return true;
    }

}
