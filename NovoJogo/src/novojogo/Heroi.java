package novojogo;

public class Heroi extends Jogador{
    
    private boolean curtoAlcance = false;
    private boolean longAlcance = false;
    private boolean desarmado = true;
    
    public Heroi(String nome) {
        super(nome);
    }

    @Override
    public void dormir(){
        super.setVida(super.getVida() + 30);
    }
}
