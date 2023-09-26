package aula0321;

public class Exemplo03 {
    public static void main(String[] args) {
        
        String nome = "Joao";
        int fome = 0, sono = 0, sede = 0;
        
        if (fome == 0 && sono == 0 || sede == 0) {
            System.out.println("Nao faz nada");
        } else if (fome == 0 && sono != 0) {
            System.out.println("Garrafa de cafe");
        } else if (fome != 0 && sono == 0) {
            System.out.println("Ovos mexidos");
        } else {
            System.out.println("Ovos com bacon e cafe");
        }
        
    }
    
}
