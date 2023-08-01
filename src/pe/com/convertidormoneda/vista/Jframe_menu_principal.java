package pe.com.convertidormoneda.vista;
import javax.swing.*;

public class Jframe_menu_principal extends JFrame{
	

	private JMenu menu;
	private JMenuBar menuBar;
	private JMenuItem menuItem,menuItem2;
	Jframe_menu_conversion_moneda conversion_moneda =new Jframe_menu_conversion_moneda();
	Jframe_conversor_temperatura conversion_temperatura = new Jframe_conversor_temperatura();
	
	public Jframe_menu_principal() {
		setLayout(null);
		this.setSize(650, 500);
		this.add(conversion_moneda.iniciarConversorMoneda());
		barraOpciones();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);	
		
	}
	
	private void barraOpciones() {
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		menu=new JMenu("Opciones");
        menuBar.add(menu);
        
        menuItem=new JMenuItem("Conversor de moneda");
        menuItem.addActionListener(e ->{
        	cambiarPanel(conversion_moneda.iniciarConversorMoneda());
        });
        
        menuItem2=new JMenuItem("Conversor de temperatura");
        menuItem2.addActionListener(e ->{
        	cambiarPanel(conversion_temperatura.iniciar_conversor_temperatura());
        });
        
        menu.add(menuItem);
        menu.add(menuItem2);
	}
	
	private void cambiarPanel(JPanel nuevoPanel) {
        getContentPane().removeAll();
        getContentPane().add(nuevoPanel);
        revalidate();
        repaint();
    }

	

}
