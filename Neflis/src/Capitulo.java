
public class Capitulo {
	private String nombre;
	private Double duracion;
	
	public Capitulo(String nombre, Double duracion) {
		this.nombre = nombre;
		this.duracion = duracion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}
	
	public Double getDuracion() {
		return duracion;
	}
	
}
