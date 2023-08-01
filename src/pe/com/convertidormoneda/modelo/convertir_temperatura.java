package pe.com.convertidormoneda.modelo;

import javax.swing.JOptionPane;

public class convertir_temperatura implements conversiones{
	
	@Override
	public float convertir(float numeroDigitado, boolean tipo, String... valores) {
	

		float conversion = 0;
		String t1 = valores[0];
		String t2 = valores[1];
		
		String tipoConversion = t1+" a "+t2;
		
		if(t1.equals(t2)) {
			conversion = numeroDigitado;
		}else {
			switch (tipoConversion) {
				case "Grado Celsius a Grado Fahrenheit":
					conversion = (numeroDigitado * 9/5) + 32;
					break;
				case "Grado Celsius a Kelvin":
					conversion = numeroDigitado + 273.15f;
					break;
				case "Grado Fahrenheit a Grado Celsius":
					conversion = (numeroDigitado - 32) * 5/9;
					break;
				case "Grado Fahrenheit a Kelvin":
					conversion = (numeroDigitado - 32) * 5/9 + 273.15f ;
					break;
				case "Kelvin a Grado Celsius":
					conversion = numeroDigitado - 273.15f;
					break;
				case "Kelvin a Grado Fahrenheit":
					conversion = (numeroDigitado - 273.15f) * 9/5 + 32;
					break;
				default:
					JOptionPane.showMessageDialog(null, "No es Posible realizar esta convesión");
					break;
				}
		}
		return conversion;
		
	}

}
