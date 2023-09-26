package livroreceitas;

import javax.swing.*;

public class Cesar {

    public void show() {
        
        JFrame frame = new JFrame("Cifra de Cesar");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        JPanel painel = new JPanel();
        painel.setLayout(null);
        
        JLabel mensagem = new JLabel("Mensagem:");
        mensagem.setBounds(10, 20, 80, 25);
        
        JButton criptografar = new JButton();
        criptografar.setBounds(10, 60, 80, 25);
        
        painel.add(mensagem);
        painel.add(criptografar);
        
        frame.add(frame);
        frame.setVisible(true);
        
    }
}
