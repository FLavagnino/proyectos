import java.util.HashSet;
import java.util.Set;

public class Usuario {
	private String nombre;
	private Set<Pelicula> peliculasVistas = new HashSet<Pelicula>();
	private Set<Capitulo> capitulosVistos = new HashSet<Capitulo>();
	
	public Usuario(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Set<Pelicula> getPeliculasVistas() {
		return peliculasVistas;
	}
	
	public Set<Capitulo> getCapitulosVistos() {
		return capitulosVistos;
	}
	
	public void verPelicula(Pelicula unaPelicula) {
		peliculasVistas.add(unaPelicula);
	}
	
	public void verCapitulo(Capitulo unCapitulo) {
		capitulosVistos.add(unCapitulo);
	}
	
//	public boolean vio(Contenido unContenido) {
//		if(unContenido.getClass() == Pelicula)
//	}
	
	public boolean vioPelicula(Pelicula unaPelicula) {
		return peliculasVistas.contains(unaPelicula);
	}
	
	public boolean vioSerie(Serie unaSerie) {
		for(Capitulo unCapitulo : unaSerie.capitulosQueTiene()) {
			if(!capitulosVistos.contains(unCapitulo)) {
				return false;
			}
		}
		return true;
	}

}
