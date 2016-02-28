import java.util.ArrayList;
import java.util.List;

public class Temporada {
	private String nombre;
	private String genero;
	private Serie perteneceASerie;
	private List<Capitulo> capitulos = new ArrayList<Capitulo>();
	
	public Temporada(String nombre) {
		this.nombre = nombre;
	}
	
	public void agragarCapitulo(Capitulo unCapitulo) {
		capitulos.add(unCapitulo);
		unCapitulo.setGenero(this.genero);
		unCapitulo.setTemporada(this);
	}
	
	public List<Capitulo> getCapitulos() {
		return capitulos;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setSerie(Serie serie) {
		this.perteneceASerie = serie;
	}
	
	public boolean perteneceATemporadaElCapitulo(Capitulo unCapitulo) {
		return capitulos.contains(unCapitulo);
	}

	public Serie getSerie() {
		return perteneceASerie;
	}
}
