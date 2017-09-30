
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Pelota extends JPanel {

	/**
	 * Create the panel.
	 */
	public Pelota() {

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image imagen = new ImageIcon(Pelota.class.getResource("/Imagenes/logo2_play.jpg")).getImage();
		int x = getWidth() / 2 - imagen.getWidth(this) / 2;
		int y = getHeight() / 2 - imagen.getHeight(this) / 2;
		g.drawImage(imagen, x, y, this);

	}

}// FIN DE LA CLASE PELOTA
