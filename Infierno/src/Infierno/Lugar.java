package Infierno;

import java.util.ArrayList;

public class Lugar {
	private String nombre;
	private ArrayList<Alma> almasHabitantes = new ArrayList<Alma>();
	private static ArrayList<Alma> almasCazables = new ArrayList<Alma>();
	
	protected Lugar() {}
	public Lugar(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public ArrayList<Alma> getAlmasHabitantes() {
		return almasHabitantes;
	}
	
	public void agregarHabitante(Alma unAlma) {
		almasHabitantes.add(unAlma);
	}
	
	public void quitarHabitante(Alma unAlma) {
		almasHabitantes.remove(unAlma);
	}
	
	public ArrayList<Alma> almasCazablesPor(Demonio unDemonio) {
		almasCazables.clear();
		for(Alma unAlma : almasHabitantes) {
			if(unDemonio.almaEsCazable(unAlma)) {
				almasCazables.add(unAlma);
			}
		}
		return almasCazables;
	}
	
	/* Metodo para testeo */
	public void mostrarHabitantes() {
		for(Alma unAlma : almasHabitantes) {
			System.out.println(unAlma.getNombre() + " " + unAlma.getNivelDeBondad() + " " + unAlma.getNivelDeValor() + " " + unAlma.getEsFriolenta());
		}
	}
}
