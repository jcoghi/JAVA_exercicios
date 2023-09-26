package aula0424.poo.exemplo;

public class Principal {
    public static void main(String[] args) {
        
        Personagem heroi = new Personagem("joao", 30);
        heroi.cumprimentar();
        
        Personagem vilao = new Personagem("A1", 30);
        vilao.cumprimentar();
        
        Personagem npcFerreiro = new Personagem("Miguel", 1);
        npcFerreiro.cumprimentar();
    }
    
}
