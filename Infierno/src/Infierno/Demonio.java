package Infierno;

import java.util.ArrayList;

public abstract class Demonio {
	protected Double nivelDeMaldad = 0.0;
	protected ArrayList<Alma> almasJodidas = new ArrayList<Alma>();
	protected ArrayList<Alma> almasCazadas = new ArrayList<Alma>();
	
	public Double getNivelDeMaldad() {
		return nivelDeMaldad;
	}
	
	public void setNivelDeMaldad(Double nivelDeMaldad) {
		this.nivelDeMaldad = nivelDeMaldad;
	}
	
	public boolean almaEsCazable(Alma unAlma) {
		return ( nivelDeMaldad > unAlma.getNivelDeBondad() && this.condicionPuedeCazarAlma(unAlma));
	}
	
	/* Con este metodo abstracto me aseguro que me obligue
	 *  a crear el metodo en todas las subclases
	 *  */
	public abstract boolean condicionPuedeCazarAlma(Alma unAlma);
	
	public void atacarAlma(Alma unAlma) {
		if(almaEsCazable(unAlma)) {
			cazarAlma(unAlma);
		} else {
			atormentarAlma(unAlma);
		}
	}
	
	protected void cazarAlma(Alma unAlma) {
		almasCazadas.add(unAlma);
		unAlma.mudateA();
		nivelDeMaldad += 2;
	}
	
	protected void atormentarAlma(Alma unAlma) {
		almasJodidas.add(unAlma);
		unAlma.restarNivelDeBondad(5.0);
		nivelDeMaldad += 1;
	}
	
	public void cazarEn(Lugar unLugar) {
		for(Alma unAlma : unLugar.getAlmasHabitantes()) {
			atacarAlma(unAlma);
		}
	}
	
//	public void realizarMision(Mision unaMision) {
//		
//	}
	
	/* Metodo para testeo */
	public int cantidadDeAlmasJodidas() {
		return almasJodidas.size();
	}
	
}