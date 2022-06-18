package POO;
/*Clase para asignar un fondo al JPanel
*/
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
class BackgroundPanel extends JPanel {

    private Image backgroundImage;

    @Override
    public void paint(Graphics g) {
        backgroundImage = new ImageIcon(getClass().getResource("/IMG/backgroundImage.jpg")).getImage();

        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
