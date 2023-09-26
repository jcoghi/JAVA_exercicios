
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaof
 */
public class Area_Perimetro {
    public static void main(String[] args) {
        double ladoMaior, ladoMenor, perimetro, area;
        
        ladoMaior = Double.parseDouble(JOptionPane.showInputDialog("Entre com a maior medida do retângulo"));
        ladoMenor = Double.parseDouble(JOptionPane.showInputDialog("Entre com a menor medida do retângulo: "));
        
        perimetro = 2 * (ladoMaior + ladoMenor);
        area = ladoMaior * ladoMenor;
        
        JOptionPane.showMessageDialog(null, "A área do retângulo é: " + area + " m²");
        JOptionPane.showMessageDialog(null, "O perímetro do retângulo é: " + perimetro + " m");
    
    
    }
}
