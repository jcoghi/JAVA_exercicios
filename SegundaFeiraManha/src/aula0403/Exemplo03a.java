package aula0403;

import java.util.Random;

public class Exemplo03a {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        int numero = aleatorio.nextInt(1, 7);
        
        System.out.println("Número " + numero);
    }
    
}
