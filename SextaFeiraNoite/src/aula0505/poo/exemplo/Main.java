/*SIMULADOR DE COLISÃO*/
package aula0505.poo.exemplo;

public class Main {

    public static void main(String[] args) {
        
        Carros fit = new Carros("dourado","Hatch", 1.0);
        
        fit.categoria = "Hatch";
        fit.cor = "dourado";
        fit.portas = 4;
        
        System.out.println("Velocidade inicial = " + fit.velocidade);
        
        for (int i = 0; i < 100; i++) {
            if (fit.velocidade < 70){
            fit.acelerar();
            }
        }
        System.out.println("Velocidade intermediaria = " + fit.velocidade);
        
        for (int i = 0; i < 30; i++) {
            fit.frear();
        }
        System.out.println("Velocidade final = " + fit.velocidade);
        System.out.println("O carro andou " + fit.x + " m");
        
        
    }
}
