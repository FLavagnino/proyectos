import java.util.ArrayList;
import java.util.List;

public class Temporada {
	private String nombre;
	private List<Capitulo> capitulos = new ArrayList<Capitulo>();
	
	public Temporada(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void agragarCapitulo(Capitulo unCapitulo) {
		capitulos.add(unCapitulo);
	}
	
	public List<Capitulo> getCapitulos() {
		return capitulos;
	}
	
	public int cantidadDeCapitulos() {
		return capitulos.size();
	}
	
	public Capitulo ultimoCapitulo() {
		return capitulos.get(cantidadDeCapitulos() - 1);
	}
}
