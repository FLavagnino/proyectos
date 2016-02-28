import java.util.HashSet;
import java.util.Set;

public class Usuario {
	private String nombre;
	public Set<Contenido> vistos = new HashSet<Contenido>();
	
	public Usuario(String nombre) {
		this.nombre = nombre;
	}
	
	public void verContenido(Contenido unContenido) {
		vistos.add(unContenido);
	}

	public boolean vio(Contenido unContenido) {
		if(unContenido.getClass() == Pelicula.class) {
			return vistos.contains(unContenido);
		} else {
			return vistos.containsAll(unContenido.getCapitulos());
		}
	}
	
	public Set<String> generosVistos() {
		Set<String> generosVistos = new HashSet<String>();
		for (Contenido contenido : vistos) {
			generosVistos.add(contenido.getGenero());
		}
		return generosVistos;
	}
	
	public String generoPreferido() {
		Double bandera = 0.0;
		String generoMasVisto = "No vio nada";
		for (String genero : generosVistos()) {
			if(tiempoVistoDeGenero(genero) > bandera) {
				bandera = tiempoVistoDeGenero(genero);
				generoMasVisto = genero;
			}
		}
		return generoMasVisto;
	}
	
	private Double tiempoVistoDeGenero(String genero) {
		Double contador = 0.0;
		for (Contenido contenido : vistos) {
			if (contenido.getGenero() == genero) {
				contador += contenido.getDuracion();
			}
		}
		return contador;
	}
	
	public boolean esFanDe(String actor) {
		for(Contenido contenido : vistos) {
			if(contenido.getActor() != actor) {
				return false;
			}
		}
		return true;
	}
	
	public Set<Contenido> seriesNoVistasCompletamente() {
		Set<Contenido> capitulos = new HashSet<Contenido>();
//		Set<Contenido> seriesNoVistasCompletamente = new HashSet<Contenido>();
		for(Contenido contenido : vistos) {
			if(contenido.getClass() == Capitulo.class) {
				if(vio(contenido.perteneceASerieElCapitulo())) {
					capitulos.add(contenido);
				}
			}
		}
		return capitulos;
	}
	
	
}
