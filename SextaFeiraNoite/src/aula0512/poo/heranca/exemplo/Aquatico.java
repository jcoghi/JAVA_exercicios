package aula0512.poo.heranca.exemplo;

public class Aquatico extends Mamifero{
    
    public boolean pes = false;
    
    @Override
    public void comunicacao() {
        super.comunicacao();
        System.out.println("Sou aquatico");
    }
    
    public void habitat() {
        System.out.println("Vivo na agua");
    }
}
