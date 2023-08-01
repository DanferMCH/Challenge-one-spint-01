package pe.com.convertidormoneda.vista;

import java.awt.Font;
import java.text.DecimalFormat;
import javax.swing.*;
import pe.com.convertidormoneda.modelo.convertir_temperatura;
import pe.com.convertidormoneda.modelo.temperaturas_disponibles;

public class Jframe_conversor_temperatura {
	
	private JLabel lbtitulo;
	private JLabel lbNumero1,lbNumero2;
	private JTextField txtNumero1,txtNumero2;
	private JComboBox<String> cbTemperatura1,cbTemperatura2;
	private JButton btnConvertir;
	boolean sw_validarCambioTemperatura = false;
	private JPanel panel = new JPanel();
	DecimalFormat formato = new DecimalFormat("#0.00");
	
	public JPanel iniciar_conversor_temperatura() {
		
			panel.setBounds(0, 0, 650, 500);
			panel.setLayout(null);

			lbtitulo = new JLabel("CONVERSOR TEMPERATURA");
			lbtitulo.setBounds(230, 50, 300, 30);
			lbtitulo.setFont(new Font("Arial", Font.BOLD, 20));
			panel.add(lbtitulo);
	        
	        ImageIcon imagen = new ImageIcon("D:\\APRENDIENDO JAVA\\Challenge ONE - Sprint 01\\recursos\\temperatura.png");
	        lbNumero1 = new JLabel("Ingresar la temperatura a convertir", imagen, 0);
	        lbNumero1.setBounds(60, 100, 300, 40);
	        panel.add(lbNumero1);
	        
	        txtNumero1 = new JTextField();
	        txtNumero1.setBounds(100, 150, 200, 30);
	        panel.add(txtNumero1);
	        
	        lbNumero2 = new JLabel("Resultado de conversión", imagen, 0);
	        lbNumero2.setBounds(20, 250, 300, 40);
	        panel.add(lbNumero2);
	        
	        txtNumero2 = new JTextField();
	        txtNumero2.setBounds(100, 300, 200, 30);
	        txtNumero2.setEnabled(false);
	        panel.add(txtNumero2);
	        
	        cbTemperatura1 = new JComboBox<String>();
	        cbTemperatura1.setBounds(350, 150, 200, 30);
	        for(String item : temperaturas_disponibles.conversiones) {
	        cbTemperatura1.addItem(item);
	        }
	        panel.add(cbTemperatura1);
	        
	        cbTemperatura2 = new JComboBox<String>();
	        cbTemperatura2.setBounds(350, 300, 200, 30);
	        for(String item : temperaturas_disponibles.conversiones) {
		        cbTemperatura2.addItem(item);
		        }
	        panel.add(cbTemperatura2);
	        
	        btnConvertir = new JButton("CONVERTIR");
	        btnConvertir.setBounds(250, 210 ,150, 30);
	        panel.add(btnConvertir);
	        btnConvertir.addActionListener(e ->{
	        	 
	        	String valida_numero = txtNumero1.getText();
	        	if(valida_numero.equals("")) {
	        		JOptionPane.showMessageDialog(null, "Debe ingrear un numero para convertir", "ERROR", JOptionPane.ERROR_MESSAGE);
	        	}else {
	        		
	        	String tipoConversion1,tipoConversion2;
	        	
	        	float numeroDigitado = Float.valueOf(valida_numero);
	        	
	        		tipoConversion1 = (String)cbTemperatura1.getSelectedItem();
	        		tipoConversion2 = (String)cbTemperatura2.getSelectedItem();
        	
	        		convertir_temperatura convertirMoneda = new convertir_temperatura();
	        	
	        	float resultado = convertirMoneda.convertir(numeroDigitado,sw_validarCambioTemperatura,tipoConversion1,tipoConversion2);
	        	txtNumero2.setText(String.valueOf(formato.format(resultado)));
	        	}
	        	 
	        });
			return panel;
	        
		

		 
		
	}

}
