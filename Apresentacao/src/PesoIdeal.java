
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaof
 */
public class PesoIdeal {
    public static void main(String[] args) {
        String sexo;
        double altura, peso;
        
        sexo = JOptionPane.showInputDialog("M - Masculino ou F - Feminino: ");
        altura = Double.parseDouble(JOptionPane.showInputDialog("Entre com a altura em metros: "));
        
        if(sexo.equals("m") || sexo.equals("M")){
            peso = (72.7 * altura) - 58;
            JOptionPane.showMessageDialog(null, "Peso ideal: " + peso);
        }
        if(sexo.equals("f") || sexo.equals("F")){
            peso = (62.1 * altura) - 44.7;
            JOptionPane.showMessageDialog(null, "Peso ideal: " + peso);
        } else {
            JOptionPane.showMessageDialog(null, "Insira um valor válido!");
        }
        
    }
}
