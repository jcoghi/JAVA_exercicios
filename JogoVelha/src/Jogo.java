import javax.swing.*;
import java.awt.*;

public class Jogo {

    private String usuarioAtual = "X";
    private int contador = 0;
    private JButton[][] botoes = {
            {new JButton(), new JButton(),new JButton()},
            {new JButton(), new JButton(),new JButton()},
            {new JButton(), new JButton(),new JButton()},
    };

    public void show() {
        JFrame frame = new JFrame("Jogo da Velha");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        panel.setLayout(new GridLayout(3,3));
        panel.setPreferredSize(new Dimension(500,500));

        for ( int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton btnAtual = botoes[i][j];
                panel.add(btnAtual);

                btnAtual.addActionListener( e -> {
                    if(btnAtual.getText().equals("")){
                        btnAtual.setText(usuarioAtual);
                        contador++;
                        if (verificarVencedor()) {
                            JOptionPane.showMessageDialog(null,usuarioAtual + " é o Vencedor");
                            reiniciar();
                        }else {
                            if (contador ==9) {
                                JOptionPane.showMessageDialog(null, " Empate!");
                                reiniciar();
                            } else{
                            usuarioAtual = (usuarioAtual.equals("X")) ? "O" : "X";
                            }
                        }
                    }
                });
            }
        }



        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public boolean verificarVencedor(){

        String b00 = botoes[0][0].getText();
        String b01 = botoes[0][1].getText();
        String b02 = botoes[0][2].getText();
        String b10 = botoes[1][0].getText();
        String b11 = botoes[1][1].getText();
        String b12 = botoes[1][2].getText();
        String b20 = botoes[2][0].getText();
        String b21 = botoes[2][1].getText();
        String b22 = botoes[2][2].getText();


        // Linhas
        if((!b00.equals("") && b00.equals(b01) && b00.equals(b02)) ||
           (!b10.equals("") && b10.equals(b11) && b10.equals(b12)) ||
           (!b20.equals("") && b20.equals(b21) && b20.equals(b22))) {
                return true;
        }
        // Colunas
        else if((!b00.equals("") && b00.equals(b10) && b00.equals(b20)) ||
                (!b01.equals("") && b01.equals(b11) && b01.equals(b21)) ||
                (!b02.equals("") && b02.equals(b12) && b02.equals(b22))) {
            return true;
        }

        // Diagonais
        else if((!b00.equals("") && b00.equals(b11) && b00.equals(b22)) ||
                (!b02.equals("") && b02.equals(b11) && b02.equals(b20))) {
            return true;
        }
            return false;
        }
        public void reiniciar() {
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botoes[i][j].setText("");
                contador = 0;
                usuarioAtual = "X";
            }
        }
        }
    }
