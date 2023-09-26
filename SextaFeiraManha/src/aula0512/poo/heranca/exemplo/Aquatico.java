package aula0512.poo.heranca.exemplo;

public class Aquatico extends Mamifero{
    
    final boolean pes = false;
    
    public void habitat() {
        System.out.println("Vivem na agua");
    }

    @Override
    public void comunicacao() {
        System.out.println("Eu faco barulhos");
    }
    
}
