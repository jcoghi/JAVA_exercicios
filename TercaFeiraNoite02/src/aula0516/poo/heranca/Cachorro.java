package aula0516.poo.heranca;

public class Cachorro extends Animal{
    
    public void correrAtrasRabo() {
        System.out.println("RODANDO!!!!");
    }
    @Override
    public void fazerSom() {
        super.fazerSom();
        System.out.println("Au Au");
    }
}
