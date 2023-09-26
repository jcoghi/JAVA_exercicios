package aula0519.poo.polimorfismo.animais;

public class Cachorro extends Animal{
    
    @Override
    public void fazerSom() {
        System.out.println("Au Au!");
        super.fazerSom();
    }
}
