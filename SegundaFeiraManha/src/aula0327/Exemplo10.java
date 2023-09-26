/*Pescador: limite de 50kg diários e multa de R$4,00 por quilo acima do limite*/
package aula0327;

import java.util.Scanner;

public class Exemplo10 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        double peso;
        String multa;
        
        System.out.println("Quantos quilos de peixe voce trouxe hoje?");
        peso = tc.nextDouble();
        
        multa = (peso <= 50)? "Sem multa" : "Multa de R$" + (peso-50)*4;
        System.out.println(multa);
        
        tc.close();
    }
}
