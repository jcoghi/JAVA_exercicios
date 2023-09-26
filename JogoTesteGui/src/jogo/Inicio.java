package jogo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Inicio {
    
    public void show() {
        
        JFrame frame = new JFrame("Jogo da Velha");
        frame.setSize(250, 160);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
//        JPanel panel = new JPanel();
//        
//        JLabel lblTitle = new JLabel();
//        lblTitle.setText("Adventure Java Game");
//        lblTitle.setBounds(10,50, 280, 5);
//        lblTitle.setFont(new java.awt.Font("Arial", 0, 18) {
//        });
//        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//       
//        
//        JLabel lblName = new JLabel();
//        lblName.setText("Nome:");
//        lblName.setBounds(100, 100, 50, 10);
//        
//        
//        panel.add(lblTitle);
//        panel.add(lblName);
//        
//        frame.add(panel);
//        frame.pack();
        frame.setVisible(true);
    }
    
}
