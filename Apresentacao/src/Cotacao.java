
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 Ler a cotação do dólar e a quantidade de dólares. Converter para número real e mostrar o resultado
 */
public class Cotacao {
    public static void main(String[] args){
        double cotacao, quantidadeDolar, quantidadeReal;
        int cambio;
        
        cotacao = Double.parseDouble(JOptionPane.showInputDialog("Qual a cotação de hoje?"));
        cambio = Integer.parseInt(JOptionPane.showInputDialog("Entre 1 para UDS ou 2 para BRL: "));
        
        switch (cambio) {
            case 1:
                quantidadeDolar = Double.parseDouble(JOptionPane.showInputDialog("Quanto deseja converter para BRL? "));
                quantidadeReal = cotacao * quantidadeDolar;
                JOptionPane.showMessageDialog(null,quantidadeReal);
                break;
                
            case 2:
                quantidadeReal = Double.parseDouble(JOptionPane.showInputDialog("Quanto deseja converter para USD? "));
                quantidadeDolar = quantidadeReal / cotacao;
                JOptionPane.showMessageDialog(null,quantidadeDolar);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Entre com uma opção válida.");
                break;
        }
    }
}
