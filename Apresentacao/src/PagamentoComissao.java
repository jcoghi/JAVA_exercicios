
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaof
 */
public class PagamentoComissao {
    public static void main(String[] args) {
        int quantidade;
        double valorUnitario, comissao;
        
        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de peças vendidas"));
        valorUnitario = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor unitário: "));
        
        
        comissao = 0.05 * quantidade * valorUnitario;
        
        JOptionPane.showMessageDialog(null, "A comissão é de R$" + comissao);
        
                
    }
}
