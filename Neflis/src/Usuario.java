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
		} else { if(unContenido.getClass() == Serie.class) {
			return vistos.containsAll(unContenido.getCapitulos());
			}
		return false;
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
	
	public Set<Serie> seriesVistas() {
		Set<Serie> seriesVistas = new HashSet<Serie>();
		for(Contenido contenido : vistos) {
			if(contenido.getClass() == Capitulo.class) {
				if(vistos.containsAll(contenido.getSerie().getCapitulos())) {
					seriesVistas.add(contenido.getSerie());
				}
			}
		}
		return seriesVistas;
	}
	
	public Set<Serie> seriesNoVistasCompletamente() {
		Set<Serie> seriesNoVistasCompletamente = new HashSet<Serie>();
		for(Contenido contenido : vistos) {
			if(contenido.getClass() == Capitulo.class) {
				if(!seriesVistas().contains(contenido.getSerie())) {
					seriesNoVistasCompletamente.add(contenido.getSerie());
				}
			}
		}
		return seriesNoVistasCompletamente;
	}
}
