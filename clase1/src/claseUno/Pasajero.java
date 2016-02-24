package claseUno;

public class Pasajero implements TipoCliente {
	
	private Double indiceBonificacion;
	private Double comision;
	
	public Pasajero(Double unIndiceBonificacion, Double unaComision) {
		indiceBonificacion = unIndiceBonificacion;
		comision = unaComision;
	}
	
	public Double getIndice() {
		return indiceBonificacion;
	}
	
	public Double calcularPrecio(Double precioBase) {
		return (indiceBonificacion * precioBase + comision);
	}
}

