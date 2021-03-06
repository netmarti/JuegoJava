import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PantallaOculta extends JFrame {

	private JPanel contentPane;

	public PantallaOculta(final Personaje player, final JFrame x) {
		setTitle("Oculta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450,300);	
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPantallaPrincipal = new JButton("Pantalla Principal");
		btnPantallaPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.resetear();
				x.setVisible(true);
				setVisible(false);
				
			}
		});
		btnPantallaPrincipal.setBounds(142, 194, 161, 23);
		contentPane.add(btnPantallaPrincipal);
	}

}
