package gui.editor;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joaof
 */
public class Principal {

    public static void main(String[] args) {
        Loading frame1 = new Loading();
        Editor frame2 = new Editor();
        frame1.progress.setBackground(Color.cyan);
        frame1.progress.setForeground(Color.BLUE);

        frame1.setVisible(true);

        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(20);
                frame1.progress.setValue(i);
                if (i % 2 == 0) {
                    frame1.lblLoading.setText("Carregando..");
                } else {
                    frame1.lblLoading.setText("Carregando...");
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        frame1.setVisible(false);
        frame2.setVisible(true);
    }

}
