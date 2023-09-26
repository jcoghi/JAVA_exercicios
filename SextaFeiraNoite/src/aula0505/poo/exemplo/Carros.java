
package aula0505.poo.exemplo;


public class Carros {
    // Características => Atributos
    double motor;
    final int rodas = 4;
    int portas = 2;
    String cor;
    String categoria;
    int velocidade;
    int x; // contador de distância no eixo X
    
//    Método Construtor
    public Carros(String cor,
            String categoria, double motor){
        this.cor = cor;
        this.categoria = categoria;
        this.motor = motor;
    }    
    
//      Métodos -> Comportamento
    public int acelerar(){
        x++;
        return velocidade += 5;
    }
    
    public int frear(){
        if (velocidade > 0) {
            velocidade -= 5;
            x++;
        } else {
            velocidade = 0;
        }
        
        return velocidade;
    }
 
}
