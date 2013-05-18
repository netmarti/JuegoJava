import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SegundaPantalla extends JFrame {

	private JPanel contentPane;

	public SegundaPantalla(final Personaje player, final JFrame x, final TerceraPantalla tercera, final PantallaOculta oculta) {
		setTitle("Segunda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450,300);	
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBoton = new JButton("boton");
		btnBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(player.getOculta()){
					oculta.setVisible(true);
					setVisible(false);
				}else{
					tercera.setVisible(true);
					setVisible(false);
				}				
			}
		});
		btnBoton.setBounds(164, 198, 118, 23);
		contentPane.add(btnBoton);
		
		JButton btnPantallaPrincipal = new JButton("Pantalla Principal");
		btnPantallaPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player.resetear();
				x.setVisible(true);
				setVisible(false);
			}
		});
		btnPantallaPrincipal.setBounds(164, 162, 118, 23);
		contentPane.add(btnPantallaPrincipal);
	}
}
