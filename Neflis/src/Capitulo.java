
public class Capitulo extends Contenido {
	private Temporada perteneceATemporada;
	
	public Capitulo(String nombre, Double duracion) {
		this.nombre = nombre;
		this.duracion = duracion;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setTemporada(Temporada temporada) {
		this.perteneceATemporada = temporada;
	}
	
	public Serie getSerie() {
		return perteneceATemporada.getSerie();
	}
}
