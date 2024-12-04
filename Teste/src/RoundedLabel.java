import javax.swing.*;
import java.awt.*;

public class RoundedLabel extends JLabel {
    public RoundedLabel(String text) {
        super(text);
        setOpaque(true);
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRoundRect(0,0,getWidth()-1,getHeight()-1,15,15);
        super.paintComponent(g);
    }

    public Dimension getPreferredSize() {
        return  new Dimension(100,100);
    }

    public static void main(String[] args) {
        Frame frame = new JFrame();
        ((JFrame) frame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ((JFrame) frame).getContentPane().setLayout(new FlowLayout());
        ((JFrame) frame).getContentPane().add(new RoundedLabel("Hello World!"));
        frame.pack();
        frame.setVisible(true);
    }
}
