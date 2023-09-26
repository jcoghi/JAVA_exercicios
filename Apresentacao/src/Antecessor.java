
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaof
 */
public class Antecessor {
    public static void main(String[] args) {
        int numeroEntrada, antecessor;
        
        numeroEntrada = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número: "));
        antecessor = numeroEntrada - 1;
        
        JOptionPane.showMessageDialog(null, "O antecessor do número " + numeroEntrada
         + " é " + antecessor);
    }    
}
