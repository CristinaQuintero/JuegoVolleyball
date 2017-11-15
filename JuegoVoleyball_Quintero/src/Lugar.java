
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Lugar extends JPanel implements Runnable {

	private JLabel jugador;
	private Rectangle lugar;
	private int SALTO = 10;
	public Jugador jugadores;
	private JFrame frame;

	private void mover(int x, int y) {
		int irX = (int) jugadores.getLocation().getX() + x;
		int irY = (int) jugadores.getLocation().getY() + y;
		jugadores.setLocation(irX, irY);// linea que lo ejecuta el movimiento
	}

	public Lugar() {
		setLayout(null);
		jugadores = new Jugador();
		jugadores.setBackground(new Color(210, 105, 30));
		jugadores.setBounds(338, 225, 50, 64);
		jugadores.SetImagePath("monita12.png");
		jugadores.setOpaque(false);
		add(jugadores);

		JButton btnControl = new JButton("Iniciar Partida");
		btnControl.setBackground(new Color(0, 102, 153));
		btnControl.setFont(new Font("Sylfaen", Font.BOLD, 10));
		btnControl.setForeground(new Color(204, 204, 51));
		btnControl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_W:
					mover(0, -SALTO);
					jugadores.moveUp();
					break;
				case KeyEvent.VK_S:
					mover(0, SALTO);
					jugadores.moveDown();
					break;
				case KeyEvent.VK_A:
					mover(-SALTO, 0);
					jugadores.moveLeft();
					break;
				case KeyEvent.VK_D:
					mover(SALTO, 0);
					jugadores.moveRight();
					break;
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}
		});
		btnControl.setBounds(10, 11, 120, 36);
		add(btnControl);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Image imagen = new ImageIcon(Pelota.class.getResource("/Imagenes/cancha_voleibolplaya1.png")).getImage();
		int x = getWidth() / 2 - imagen.getWidth(this) / 2;
		int y = getHeight() - imagen.getHeight(this);
		g.drawImage(imagen, x, y, this);

		lugar = new Rectangle(x, y, imagen.getWidth(this), imagen.getHeight(this));
		Thread t = new Thread(this);
		t.start();
	}

	public Rectangle getLugar() {
		return lugar;
	}

	@Override
	public void run() {

	}
}// FIN DE LA CLASE LUGAR
