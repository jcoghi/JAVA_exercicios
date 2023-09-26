/*
    Acontece quando 2 classes começam a ter o mesmo comportamento
    Herança -> 
Sobrecarga de método -> 
    Temos mais de um método em uma classe com o mesmo nome, mas 
    assinaturas diferentes
Sobrescrita de método ->
    Reescrevo um método em outra classe para uma determinada 
    função
 */
package aula0519.poo.polimorfismo;

import aula0519.poo.polimorfismo.animais.Cachorro;
import aula0519.poo.polimorfismo.animais.Gato;


public class Main {
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();
        
        Gato siames = new Gato();
        siames.fazerSom();
        
        Gato persa = new Gato();
        persa.fazerSom();
        
    }
   
}
