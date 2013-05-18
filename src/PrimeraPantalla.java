import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PrimeraPantalla extends JFrame {

	private JPanel contentPane;	
	
	public PrimeraPantalla(final Personaje player, final JFrame x, final SegundaPantalla segunda, final TerceraPantalla tercera) {
		setTitle("Primera");	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450,300);	
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBotonSegunda = new JButton("Boton Segunda");
		btnBotonSegunda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.setPrimera();
				segunda.setVisible(true);
				setVisible(false);
			}
		});
		btnBotonSegunda.setBounds(142, 117, 134, 23);
		contentPane.add(btnBotonSegunda);
		
		JButton btnBotonPrincipal = new JButton("Boton Principal");
		btnBotonPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.resetear();
				x.setVisible(true);
				setVisible(false);
			}
		});
		btnBotonPrincipal.setBounds(142, 81, 134, 23);
		contentPane.add(btnBotonPrincipal);
		
		JButton btnBotonTercera = new JButton("Boton Tercera");
		btnBotonTercera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.resetear();
				tercera.setVisible(true);
				setVisible(false);
			}
		});
		btnBotonTercera.setBounds(142, 151, 134, 23);
		contentPane.add(btnBotonTercera);
	
		
	}
}
