import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido{
	private List<Temporada> temporadas = new ArrayList<Temporada>();
	
	public Serie(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Capitulo> capitulosQueTiene() {
		List<Capitulo> capitulos = new ArrayList<Capitulo>();
		for(Temporada unaTemporada : temporadas) {
			capitulos.addAll(unaTemporada.getCapitulos());
		}
		return capitulos;
	}
	
	public List<Temporada> getTemporadas() {
		return temporadas;
	}
	
	public void agregarTemporada(Temporada unaTemporada) {
		temporadas.add(unaTemporada);
	}
	
	public Double getDuracion() {
		Double duracionTotal = 0.0;
		for(Capitulo capitulo : this.capitulosQueTiene()) {
			duracionTotal += capitulo.getDuracion();
		}
		return duracionTotal;
	}

	public int cantidadDeTemporadas() {
		return temporadas.size();
	}
	
	public Temporada ultimaTemporada() {
		return temporadas.get(cantidadDeTemporadas() - 1);
	}
}