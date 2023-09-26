/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somatorio;
import java.util.Scanner;
/**
 *
 * @author profslpa
 */
public class Somatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        int acumulador = 0;
        
        while (contador <= 10){
            acumulador = acumulador + contador;
            contador++;
            System.out.println("a soma eh" + acumulador);
            
        }
    }
    
}
