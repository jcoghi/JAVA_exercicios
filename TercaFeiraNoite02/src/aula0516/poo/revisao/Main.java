package aula0516.poo.revisao;

public class Main {

    public static void main(String[] args) {
        
        Personagem h = new Personagem();
        
        int hp = h.getVida();
        System.out.println("hp: " + hp);
        System.out.println("h.vida: " + h.getVida());
        
        hp -= 8;
        h.setVida(h.getVida() - 3);
        
        System.out.println("hp: " + hp);
        System.out.println("h.vida: " + h.getVida());
        
    }

}
