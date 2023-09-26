
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaof
 */
public class SomarQuadrado {
    public static void main(String[] args) {
        int primeiroNumero, segundoNumero, terceiroNumero, quartoNumero, soma;
        
        primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro número: "));
        segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Etre com o segundo número: "));
        terceiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Entre com o terceiro número :"));
        quartoNumero = Integer.parseInt(JOptionPane.showInputDialog("Entre com o quarto número: "));
        
        soma = primeiroNumero*primeiroNumero + segundoNumero*segundoNumero +
                terceiroNumero*terceiroNumero + quartoNumero*quartoNumero;
        JOptionPane.showMessageDialog(null, soma);
                
    }
}
