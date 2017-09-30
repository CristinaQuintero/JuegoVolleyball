
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Lugar extends JPanel {

	/**
	 * Create the panel.
	 */
	public Lugar() {

	}

	public void paintComponent(Graphics g) {

		Image imagen = new ImageIcon(Pelota.class.getResource("/Imagenes/cancha_voleibol.png")).getImage();
		int x = getWidth() / 2 - imagen.getWidth(this) / 2;
		int y = getHeight() - imagen.getHeight(this);
		g.drawImage(imagen, x, y, this);

	}

}// FIN DE LA CLASE LUGAR
