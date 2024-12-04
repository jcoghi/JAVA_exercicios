import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class GeradorDeImagem {
    public static void main(String[] args) throws Exception {
        int largura = 1200;
        int altura = 800;

        BufferedImage imagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = imagem.createGraphics();

        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, largura, altura);

        g2d.setColor(Color.RED);
        g2d.setFont(new Font("Arial", Font.BOLD, 350));
        g2d.drawString("Python", 10, 500);

        ImageIO.write(imagem, "png", new File("imagem.png"));
    }
}
