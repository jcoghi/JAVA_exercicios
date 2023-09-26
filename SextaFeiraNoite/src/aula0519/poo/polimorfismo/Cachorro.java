package aula0519.poo.polimorfismo;

import java.util.Objects;

public class Cachorro extends Animal{
    
    private String name = "joao";
    
    @Override
    public void fazerSom() {
        super.fazerSom();
        System.out.println("Au Au");
    }
    
    @Override
    public String toString() {
        return "O nome do cachorro = " + name;
    }
    
    
}
