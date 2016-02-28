import java.util.HashSet;
import java.util.Set;

public class Repositorio {
	private Set<Contenido> contenidos = new HashSet<Contenido>();
	private Set<Contenido> destacados = new HashSet<Contenido>();
	
	public void agregarContenido(Contenido contenido) {
		contenidos.add(contenido);
	}
	
	public Set<Contenido> getContenidos() {
		return contenidos;
	}
	
	public void agregarDestacado(Contenido contenido) {
		destacados.add(contenido);
	}
	
//	public Set<Contenido> recomendarContenidoA(Usuario usuario) {
//		Set<Contenido> contenidosRecomendados = new HashSet<Contenido>();
//		contenidosRecomendados.addAll(destacados);
//		contenidosRecomendados.addAll(usuario.seriesNoVistasCompletamente());
//		return contenidosRecomendados;
//	}
}
