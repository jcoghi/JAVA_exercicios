package jogoenum;

public class Heroi extends Jogador {

    private boolean armaCurto = false;
    private boolean armaLongo = true;
    private boolean desarmado = false;
    
    Heroi(){
        super(0,0);
    }

    @Override
    public boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (this.armaCurto == true) {
            if (deltaX == 0 && deltaY == 1) {
                oponente.vida -= 10;
                return true;
            } else if (deltaX == 1 && deltaY == 0) {
                oponente.vida -= 10;
                return true;
            }
        }else if (this.armaLongo == true) {
            if (deltaX == 0 && deltaY == 3) {
                oponente.vida -= 5;
                return true;
            } else if (deltaX == 3 && deltaY == 0) {
                oponente.vida -= 5;
                return true;
            }
        }
        return false;
    }

    public void trocarArma(int arma) {
        switch (arma) {
            case 0:
                armaCurto = false;
                armaLongo = false;
                desarmado = true;
                break;
            case 1:
                armaCurto = true;
                armaLongo = false;
                desarmado = false;
                break;
            case 2:
                armaCurto = false;
                armaLongo = true;
                desarmado = false;
                break;
            default:
                break;
        }
    }
}
