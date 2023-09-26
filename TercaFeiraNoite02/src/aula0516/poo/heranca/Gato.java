package aula0516.poo.heranca;

public class Gato extends Animal{
    
    String corDoPelo;
    int idade;
    String raça;
    
    public void fugirDeNoite() {
        System.out.println("Vou procurar uma companhia");
    }
    
    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }
}
