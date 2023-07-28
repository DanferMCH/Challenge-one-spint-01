package pe.com.convertidormoneda.modelo;

import javax.swing.JOptionPane;

public class convertir_moneda implements conversiones {
	
	monedas valorMoneda = new monedas();

	@Override
	public float convertir(float numeroDigitado, String moneda, boolean validacion) {
		
		float tipoCambio = 0;
		
		if(validacion) {
			switch (moneda) {
			case "Dolar":
					tipoCambio = valorMoneda.getSoles_a_dolar();
				break;
			case "Euro":
					tipoCambio = valorMoneda.getSoles_a_euro();
				break;
			case "Libras Esterlinas":
					tipoCambio = valorMoneda.getSoles_a_libras_esterlinas();
				break;
			case "Yen Japonés":
					tipoCambio = valorMoneda.getSoles_a_yen_japonés();
				break;
			case "Won sul-coreano":
					tipoCambio = valorMoneda.getSoles_a_won_sul_coreano();
				break;

			default:
				JOptionPane.showMessageDialog(null, "No es Posible realizar esta convesión");
				break;
			}
		}else {
			switch (moneda) {
			case "Dolar":
					tipoCambio = valorMoneda.getDolar_a_soles();
				break;
			case "Euro":
					tipoCambio = valorMoneda.getEuro_a_soles();
				break;
			case "Libras Esterlinas":
					tipoCambio = valorMoneda.getLibras_esterlinas_a_soles();
				break;
			case "Yen Japonés":
					tipoCambio = valorMoneda.getYen_japonés_a_soles();
				break;
			case "Won sul-coreano":
					tipoCambio = valorMoneda.getWon_sul_coreano_a_soles();
				break;

			default:
				JOptionPane.showMessageDialog(null, "No es Posible realizar esta convesión");
				break;
			}
			
		}
		return numeroDigitado  * tipoCambio;
	}

	
	
	
	
	
	

}
