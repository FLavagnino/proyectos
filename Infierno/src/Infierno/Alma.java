package Infierno;

public class Alma {
	private Double nivelDeBondad;
	private Double nivelDeValor;
	private boolean esFriolenta;
	private Lugar lugarQueHabita;
	
	public Alma(Double nivelDeBondad, Double nivelDeValor, boolean esFriolenta) {
		this.nivelDeBondad = nivelDeBondad;
		this.nivelDeValor = nivelDeValor;
		this.esFriolenta = esFriolenta;
	}
	
	public Double getNivelDeBondad() {
		return nivelDeBondad;
	}
	public void setNivelDeBondad(Double nivelDeBondad) {
		this.nivelDeBondad = nivelDeBondad;
	}
	public Double getNivelDeValor() {
		return nivelDeValor;
	}
	public void setNivelDeValor(Double nivelDeValor) {
		this.nivelDeValor = nivelDeValor;
	}
	public boolean getEsFriolenta() {
		return esFriolenta;
	}
	public void setEsFriolenta(boolean esFriolenta) {
		this.esFriolenta = esFriolenta;
	}
	public Lugar getLugarQueHabita() {
		return lugarQueHabita;
	}
	public void setLugarQueHabita(Lugar lugarQueHabita) {
		this.lugarQueHabita = lugarQueHabita;
	}
	
	public void olvidarLugarQueHabita() {
		lugarQueHabita = null;
	}
	
	public void restarNivelDeBondad(Double unNivel) {
		nivelDeBondad -= unNivel;
	}
	
	public void restarNivelDeValor(Double unNivel) {
		nivelDeValor -= unNivel;
	}
	
	public void cambiarEstadoFriolento() {
		if(esFriolenta) {
			esFriolenta = false;
		} else {
			esFriolenta = true;
		}
	}
}
