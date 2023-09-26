/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros.pares;
import java.util.Scanner;
/**
 *
 * @author profslpa
 */
public class NumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador;
        contador = 0;
        int resto;
        
        while(contador <=10){
            resto = contador % 2;
            
            if(resto == 0){
                System.out.println("O numero " + contador + " eh par ");
            }
            contador++;
        }
    }
    
}
