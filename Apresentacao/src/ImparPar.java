
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaof
 */
public class ImparPar {
    public static void main(String[] args) {
        int entrada, validacao;
        
        entrada = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número: "));
        validacao = entrada % 2;
        
        if(validacao == 1) {
            JOptionPane.showMessageDialog(null, "Ímpar");
        } else{
            JOptionPane.showMessageDialog(null, "Par");
        }
    }
    
}
