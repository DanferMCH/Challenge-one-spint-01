package pe.com.convertidormoneda.vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Jframe_inicio extends JFrame implements ActionListener{
	
	private JLabel lbTitulo;
	private JButton btnBienvenida;
	
	
	public Jframe_inicio() {
		setLayout(null);
		this.setSize(300, 400);
		iniciarBienvenida();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	private void iniciarBienvenida() {
		this.setTitle("BIENVENIDA");
		lbTitulo = new JLabel("BIENVENIDOS");
		btnBienvenida = new JButton("EMPEZAR");
		btnBienvenida.setBounds(80,200,130,40);
		btnBienvenida.addActionListener(this);
		
		lbTitulo.setBounds(80,100,200,30);
		lbTitulo.setFont(new Font("Arial", Font.BOLD, 20));
		
		this.add(btnBienvenida);
		this.add(lbTitulo);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnBienvenida) {
			Jframe_menu_principal menuInicio = new Jframe_menu_principal();
			menuInicio.setVisible(true);
			this.dispose();
		}
		
		
		
	}
	

	
}
