
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaof
 */
public class Eleicao {
    public static void main(String[] args) {
        double eleitores, nulos, brancos, validos;
        double porcentagemNulos, porcentagemBrancos, porcentagemValidos;
        
        eleitores = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de eleitores"));
        nulos = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de votos nulos: "));
        brancos = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de votos em branco: "));
        
        validos = eleitores - nulos - brancos;
        
        porcentagemBrancos = brancos / eleitores * 100;
        JOptionPane.showMessageDialog(null, "Temos " + porcentagemBrancos  + "% votos em branco");
        
        porcentagemNulos = nulos / eleitores * 100;
        JOptionPane.showMessageDialog(null, "Temos " + porcentagemNulos  + "% votos em nulos");
        
        porcentagemValidos = validos / eleitores * 100;
        JOptionPane.showMessageDialog(null, "Temos " + porcentagemValidos  + "% votos em válidos");
    }
    
}
