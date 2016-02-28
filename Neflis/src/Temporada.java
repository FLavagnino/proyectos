import java.util.ArrayList;
import java.util.List;

public class Temporada {
	private String nombre;
	private String genero;
	private List<Capitulo> capitulos = new ArrayList<Capitulo>();
	
	public Temporada(String nombre) {
		this.nombre = nombre;
	}
	
	public void agragarCapitulo(Capitulo unCapitulo) {
		capitulos.add(unCapitulo);
		unCapitulo.setGenero(this.genero);
	}
	
	public List<Capitulo> getCapitulos() {
		return capitulos;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public boolean perteneceATemporadaElCapitulo(Capitulo unCapitulo) {
		return capitulos.contains(unCapitulo);
	}
//	public String getNombre() {
//		return nombre;
//	}
	
	
	
//	public List<Capitulo> getCapitulos() {
//		return capitulos;
//	}
//	
//	public int cantidadDeCapitulos() {
//		return capitulos.size();
//	}
//	
//	public Capitulo ultimoCapitulo() {
//		return capitulos.get(cantidadDeCapitulos() - 1);
//	}
}
