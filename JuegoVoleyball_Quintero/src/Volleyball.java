
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JMenuItem;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import javax.swing.JTextPane;
import java.awt.List;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.Choice;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;

public class Volleyball extends JFrame {

	private JPanel contentPane;
	private JPanel pnlJuego;
	private Lugar pnlLugar;
	private JButton btnJugar;
	private JButton btnPausar;
	public Jugador jugadores;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volleyball frame = new Volleyball();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Volleyball() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Volleyball.class.getResource("/Imagenes/logo2_play.jpg")));
		setAlwaysOnTop(true);
		setTitle("VolleyBall_Juego");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		// setBounds(100, 100, 537, 539);
		setBounds(235, 25, 930, 700);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnRegistro = new JMenu("REGISTRO");
		mnRegistro.setBackground(new Color(204, 102, 153));
		mnRegistro.setForeground(new Color(255, 20, 147));
		menuBar.add(mnRegistro);

		JMenuItem mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.setIcon(new ImageIcon(Volleyball.class.getResource("/Imagenes/iconoVollley.jpg")));
		mntmGuardar.setSelected(true);
		mnRegistro.add(mntmGuardar);

		JMenu mnIntrucciones = new JMenu("INSTRUCCIONES");
		mnIntrucciones.setBackground(new Color(153, 102, 255));
		mnIntrucciones.setForeground(new Color(204, 102, 255));
		menuBar.add(mnIntrucciones);

		JTextArea txtInstrucciones = new JTextArea();
		txtInstrucciones.setEditable(false);
		txtInstrucciones.setBackground(new Color(204, 255, 255));
		txtInstrucciones.setTabSize(10);
		txtInstrucciones.setRows(10);
		txtInstrucciones.setText(
				"  \r\n           V O L E I B O L  de   P L A Y A\r\n\r\n\r\n[JUGADORES] = [ 1 ]  &  [ 2 ] Jugadores\r\n\r\n[EQUIPOS]= Son [ 2 ]\r\n\r\n-Equipo visitante/USUARIO\r\n-Equipo Casa/SISTEMA\r\n\r\n[TIEMPOS]\r\n[1 SET]         3 MIN \r\n\r\n[2 SET]         3 MIN\r\n\r\n[3 SET]         1.5MIN\r\n\r\n[GANADOR]\r\n\r\nEL QUE HAYA GANADO  [ 2 ]SET'S  CON EL MAYOR PUNTUAJE.\r\n\r\n");
		mnIntrucciones.add(txtInstrucciones);

		JMenu mnInf = new JMenu("INFORMACION");
		mnInf.setBackground(new Color(255, 102, 51));
		mnInf.setForeground(new Color(255, 165, 0));
		menuBar.add(mnInf);

		JTextArea txtInformacion = new JTextArea();
		txtInformacion.setEditable(false);
		txtInformacion.setForeground(new Color(51, 0, 0));
		txtInformacion.setTabSize(20);
		txtInformacion.setRows(10);
		txtInformacion.setBackground(new Color(204, 204, 255));
		txtInformacion.setToolTipText("");
		txtInformacion.setText(
				"     \r\n    UNIVERSIDAD AUTONOMA DE BAJA CALIFORNIA\r\n\r\n\r\n>Materia : Programacion Orientada Objetos Avanzada\r\n>Proyecto : Juego de [Voleibol de playa]\r\n>Alumna : Cristina Quintero Marin\r\n>Matricula : 01216718\r\n\r\n");
		mnInf.add(txtInformacion);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.SOUTH);

		JButton btnJugar = new JButton("JUGAR");
		btnJugar.setForeground(new Color(255, 255, 255));

		btnJugar.setBackground(new Color(51, 153, 153));
		btnJugar.setFont(new Font("Narkisim", Font.BOLD, 13));
		panelBotones.add(btnJugar);

		JButton btnPausar = new JButton("PAUSAR");
		btnPausar.setBackground(new Color(51, 153, 204));
		btnPausar.setForeground(new Color(255, 255, 255));
		btnPausar.setFont(new Font("Narkisim", Font.BOLD, 13));
		panelBotones.add(btnPausar);

		final JPanel panelJuego = new JPanel();
		contentPane.add(panelJuego, BorderLayout.CENTER);
		panelJuego.setLayout(new CardLayout(0, 0));

		Pelota pnlPresentacion = new Pelota();// panel de tipo pelota
		panelJuego.add(pnlPresentacion, "Pelota");

		Lugar pnlLugar = new Lugar();// se agrego al panel juego.
		panelJuego.add(pnlLugar, "Lugar");// se agrega un id a los paneles

		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// intrucciones para el boton jugar
				setBounds(235, 25, 930, 700);
				CardLayout c = (CardLayout) panelJuego.getLayout();
				c.show(panelJuego, "Lugar");
			}
		});
	}//
}// FIN DE LA CLASE VOLLEYBALL
