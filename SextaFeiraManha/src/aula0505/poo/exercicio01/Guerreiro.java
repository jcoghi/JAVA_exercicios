package aula0505.poo.exercicio01;

import java.util.Random;

/*Aventureiros:
 - Terá 2 classes filhas:
   - Guerreiro:
     - Força;
     - Ataque() será de 3 a 8 
*/
public class Guerreiro extends Aventureiro{
//    ATRIBUTO
    private int forca = 10;
//    CONSTRUTOR
    public Guerreiro(String nome, int vida, boolean atacavel){
        super(nome, vida,atacavel);
    }
//    MÉTODOS
    @Override
    public int ataque() {
        Random gerador = new Random();
        return gerador.nextInt(6) + 3;
    }
}
