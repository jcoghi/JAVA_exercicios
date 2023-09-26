package aula0505.poo.exercicio01;
/*
Aventureiros:
 - Terá 2 classes filhas:
   - Guerreiro:
     - Força;
     - Ataque() será de 3 a 8 
*/
public class Aventureiro extends Personagem{
    
    public Aventureiro(String nome, int vida, boolean atacavel){
        super(nome, vida,atacavel);
    }
}
