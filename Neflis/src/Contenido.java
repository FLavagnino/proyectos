import java.util.List;

public abstract class Contenido {
	protected String nombre;
	protected Double duracion;
	protected String genero;
	protected String actor = "No tiene actor cargado";
	
	public List<Contenido> getCapitulos() {
		return null;
	} 
	
	public Double getDuracion() {
		return duracion;
	}
	
	public Contenido getUltimoCapitulo() {
		return null;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public String getActor() {
		return genero;
	}
	
	public void setActor(String actor) {
		this.actor = actor;
	}
	
	public boolean actuoActor(String actor) {
		return this.actor == actor;
	}
	
	public Serie getSerie() {
		return null;
	}
	
	public boolean perteneceASerieElCapitulo(Capitulo unCapitulo) {
		return false;
	}
//	public TipoDeContenido getTipo(Contenido unContenido) {
//		return tipoDeContenido;
//	}
//	
//	public TipoDeContenido tipo() {
//		return tipoDeContenido;
//	}
//	
	
}
