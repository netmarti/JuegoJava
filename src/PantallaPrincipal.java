import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaPrincipal {

	private JFrame frmPrincipal;
	private PrimeraPantalla ventanaPrimera;
	private SegundaPantalla ventanaSegunda;
	private TerceraPantalla ventanaTercera;
	private PantallaOculta ventanaOculta;
	private Personaje player;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPrincipal window = new PantallaPrincipal();					
					window.frmPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PantallaPrincipal() {
		initialize();
		inicializePersonaje();
		inicializeVentanas();		
	}
	
	private void inicializePersonaje(){
		player = new Personaje();
	}
	
	private void inicializeVentanas(){
		ventanaOculta = new PantallaOculta(player, frmPrincipal);
		ventanaTercera = new TerceraPantalla(player, frmPrincipal);
		ventanaSegunda = new SegundaPantalla(player, frmPrincipal, ventanaTercera, ventanaOculta);
		ventanaPrimera = new PrimeraPantalla(player, frmPrincipal, ventanaSegunda, ventanaTercera);
	}
	
	private void initialize() {
		frmPrincipal = new JFrame();
		frmPrincipal.setTitle("Principal");
		frmPrincipal.setSize(450,300);	
		frmPrincipal.setLocationRelativeTo(null);			
		frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frmPrincipal.getContentPane().setLayout(null);
		
		JButton btnPrimeraPantalla = new JButton("Primera Pantalla");
		btnPrimeraPantalla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.resetear();
				player.setPrincipal();
				ventanaPrimera.setVisible(true);
				frmPrincipal.setVisible(false); 
			}
		});
		btnPrimeraPantalla.setBounds(144, 81, 128, 30);
		frmPrincipal.getContentPane().add(btnPrimeraPantalla);
		
		JButton btnNewButton = new JButton("Segunda Pantalla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.resetear();
				player.setPrincipal();
				ventanaSegunda.setVisible(true);
				frmPrincipal.setVisible(false);			
			}
		});
		btnNewButton.setBounds(144, 122, 128, 30);
		frmPrincipal.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tercera Pantalla");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.resetear();
				player.setPrincipal();
				ventanaTercera.setVisible(true);
				frmPrincipal.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(144, 163, 128, 30);
		frmPrincipal.getContentPane().add(btnNewButton_1);
	}
}
