package Infierno;

public class Alma {
	private String nombre;
	private Double nivelDeBondad;
	private Double nivelDeValor;
	private boolean esFriolenta;
	private Lugar lugarQueHabita;
	
	public Alma(String nombre, Double nivelDeBondad, Double nivelDeValor, boolean esFriolenta, Lugar lugarQueHabita) {
		this.nombre = nombre;
		this.nivelDeBondad = nivelDeBondad;
		this.nivelDeValor = nivelDeValor;
		this.esFriolenta = esFriolenta;
		this.lugarQueHabita = lugarQueHabita;
		lugarQueHabita.agregarHabitante(this);
	}
	
	/*Metodo para testeo */
	public void mostrate() {
		System.out.println(nombre + " " + nivelDeBondad + " " + nivelDeValor + " " + esFriolenta + " " + lugarQueHabita.getNombre());
	}
	
	public String getNombre() {
		return nombre;
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
	
	public void mudateA() {
		lugarQueHabita.quitarHabitante(this);
//		lugarQueHabita = infierno;
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
