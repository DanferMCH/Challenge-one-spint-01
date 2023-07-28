package pe.com.convertidormoneda.vista;
import java.awt.*;
import java.text.DecimalFormat;
import javax.swing.*;
import pe.com.convertidormoneda.modelo.convertir_moneda;
import pe.com.convertidormoneda.modelo.divisas_disponibles;

public class Jframe_menu_conversion extends JFrame{
	
	private JMenu menu;
	private JMenuBar menuBar;
	private JMenuItem menuItem,menuItem2;
	private JLabel lbtitulo;
	private JLabel lbNumero1,lbNumero2;
	private JTextField txtNumero1,txtNumero2;
	private JComboBox<String> cbMonedas1,cbMonedas2;
	private JButton btnConvertir,btnInvertir;
	boolean sw_validarCambioDivisas = false;
	
    DecimalFormat formato = new DecimalFormat("#0.00");

	
	public Jframe_menu_conversion() {
		setLayout(null);
		this.setSize(650, 500);
		iniciarBienvenida();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

	private void iniciarBienvenida() {
		
		lbtitulo = new JLabel("CONVERSOR ALURA");
		lbtitulo.setBounds(230, 50, 300, 30);
		lbtitulo.setFont(new Font("Arial", Font.BOLD, 20));
		this.add(lbtitulo);
		
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		menu=new JMenu("Opciones");
        menuBar.add(menu);
        
        menuItem=new JMenuItem("Conversor de moneda");
        menu.add(menuItem);
        menuItem2=new JMenuItem("Conversor de temperatura");
        menu.add(menuItem2);
        
        ImageIcon imagen = new ImageIcon("D:\\APRENDIENDO JAVA\\Challenge ONE - Sprint 01\\recursos\\moneda.png");
        lbNumero1 = new JLabel("Ingresar cantidad de dinero a convertir", imagen, 0);
        lbNumero1.setBounds(60, 100, 300, 40);
        this.add(lbNumero1);
        
        txtNumero1 = new JTextField();
        txtNumero1.setBounds(100, 150, 200, 30);
        this.add(txtNumero1);
        
        lbNumero2 = new JLabel("Resultado de conversión", imagen, 0);
        lbNumero2.setBounds(20, 250, 300, 40);
        this.add(lbNumero2);
        
        txtNumero2 = new JTextField();
        txtNumero2.setBounds(100, 300, 200, 30);
        txtNumero2.setEnabled(false);
        this.add(txtNumero2);
        
        cbMonedas1 = new JComboBox<String>();
        cbMonedas1.setBounds(350, 150, 200, 30);
        for(String item : divisas_disponibles.conversiones) {
        cbMonedas1.addItem(item);
        }
        this.add(cbMonedas1);
        
        cbMonedas2 = new JComboBox<String>();
        cbMonedas2.setBounds(350, 300, 200, 30);
        cbMonedas2.addItem("Soles");
        this.add(cbMonedas2);
        
        btnInvertir = new JButton("INVERTIR");
        btnInvertir.setBounds(150, 210 ,150, 30);
        btnInvertir.addActionListener(e ->{
        	
        	if(sw_validarCambioDivisas) {
        		
    			cbMonedas1.removeAllItems();
    			cbMonedas2.removeAllItems();
	    		divisas_disponibles.conversiones.forEach(conversiones -> 
	    				cbMonedas1.addItem(conversiones)
	    			);
	    		sw_validarCambioDivisas = false;
        		cbMonedas2.addItem("Soles");
        		
        	}else {
        		cbMonedas1.removeAllItems();
        		cbMonedas2.removeAllItems();
        		divisas_disponibles.conversiones.forEach(conversiones -> 
							cbMonedas2.addItem(conversiones)
        				);
    	    	cbMonedas1.addItem("Soles");
    	    	sw_validarCambioDivisas = true;     
        	}
        	
        	
        });
        this.add(btnInvertir);
        
        btnConvertir = new JButton("CONVERTIR");
        btnConvertir.setBounds(320, 210 ,150, 30);
        this.add(btnConvertir);
        btnConvertir.addActionListener(e ->{
        	 
        	String valida_numero = txtNumero1.getText();
        	if(valida_numero.equals("")) {
        		JOptionPane.showMessageDialog(null, "Debe ingrear un numero para convertir", "ERROR", JOptionPane.ERROR_MESSAGE);
        	}else {
        		
        	String tipoConversion;
        	float numeroDigitado = Float.valueOf(valida_numero);
        	if(sw_validarCambioDivisas) {
        		tipoConversion = (String)cbMonedas2.getSelectedItem();
        	}else {
        		tipoConversion = (String)cbMonedas1.getSelectedItem();
        	}
        	convertir_moneda convertirMoneda = new convertir_moneda();
        	
        	float resultado = convertirMoneda.convertir(numeroDigitado,tipoConversion,sw_validarCambioDivisas);
        	
        	txtNumero2.setText(String.valueOf(formato.format(resultado)));
        	}
        	 
        });
        
	}

	
	
	

}
