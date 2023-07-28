package pe.com.convertidormoneda.modelo;

public class monedas {
	
	private float soles_a_dolar;
	private float soles_a_euro;
	private float soles_a_libras_esterlinas;
	private float soles_a_yen_japonés;
	private float soles_a_won_sul_coreano;
	
	private float dolar_a_soles;
	private float euro_a_soles;
	private float libras_esterlinas_a_soles;
	private float yen_japonés_a_soles;
	private float won_sul_coreano_a_soles;
	
	public monedas() {
		this.soles_a_dolar = 0.27f;
		this.soles_a_euro = 0.25f;
		this.soles_a_libras_esterlinas = 0.21f;
		this.soles_a_yen_japonés = 38.00f;
		this.soles_a_won_sul_coreano = 350.25f;
		
		this.dolar_a_soles = 3.65f;
		this.euro_a_soles = 4.01f;
		this.libras_esterlinas_a_soles = 4.66f;
		this.yen_japonés_a_soles = 0.026f;
		this.won_sul_coreano_a_soles = 0.0029f;
		
	}
	
	public float getSoles_a_dolar() {
		return soles_a_dolar;
	}
	public float getSoles_a_euro() {
		return soles_a_euro;
	}
	public float getSoles_a_libras_esterlinas() {
		return soles_a_libras_esterlinas;
	}
	public float getSoles_a_yen_japonés() {
		return soles_a_yen_japonés;
	}
	public float getSoles_a_won_sul_coreano() {
		return soles_a_won_sul_coreano;
	}
	public float getDolar_a_soles() {
		return dolar_a_soles;
	}
	public float getEuro_a_soles() {
		return euro_a_soles;
	}
	public float getLibras_esterlinas_a_soles() {
		return libras_esterlinas_a_soles;
	}
	public float getYen_japonés_a_soles() {
		return yen_japonés_a_soles;
	}
	public float getWon_sul_coreano_a_soles() {
		return won_sul_coreano_a_soles;
	}
	
	
	

}
