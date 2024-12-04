public class Jogador {
    int x;
    int y;
    int vida = 100;
    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if(deltaX == x && deltaY == 1) {
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
            case CIMA -> y++;
            case BAIXO -> y--;
            case DIREITA -> x++;
            case ESQUERDA -> x--;
        }
        return true;
    }

}
