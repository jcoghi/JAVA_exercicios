
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaof
 */
public class AnosEmDias {
    public static void main(String[] args) {
        int anos, dias;
        
        anos = Integer.parseInt(JOptionPane.showInputDialog("Entre com sua idade em anos: "));
        dias = anos * 365;
        
        JOptionPane.showMessageDialog(null, "Você tem " + dias + " dias");
    }
}
