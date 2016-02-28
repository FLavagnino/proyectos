import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {
	private List<Temporada> temporadas = new ArrayList<Temporada>();

	public Serie(String nombre, String genero) {
		this.nombre = nombre;
		this.genero = genero;
	}
	
	public void agregarTemporada(Temporada unaTemporada) {
		temporadas.add(unaTemporada);
		unaTemporada.setGenero(this.genero);
		unaTemporada.setSerie(this);
	}
	
	public List<Contenido> getCapitulos() {
		List<Contenido> capitulos = new ArrayList<Contenido>();
		for(Temporada unaTemporada : temporadas) {
			capitulos.addAll(unaTemporada.getCapitulos());
		}
		return capitulos;
	}
	
	public Double getDuracion() {
		Double duracionTotal = 0.0;
		for(Contenido capitulo : this.getCapitulos()) {
			duracionTotal += capitulo.getDuracion();
		}
		return duracionTotal;
	}
	
	public Contenido getUltimoCapitulo() {
		return getCapitulos().get(getCapitulos().size()-1);
	}
	
	public boolean perteneceASerieElCapitulo(Capitulo unCapitulo) {
		for(Temporada temporada : temporadas) {
			if(temporada.perteneceATemporadaElCapitulo(unCapitulo)) {
				return true;
			}
		}
		return false;
	}
	
}