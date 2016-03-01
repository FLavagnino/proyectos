package clientesYPaquetes;

public class PaqueteTipoPrecioFijo implements TipoDePaquete {
	private Double precioBase;
	
	public PaqueteTipoPrecioFijo(Double precioBase) {
		this.precioBase = precioBase;
	}
	
	public Double precioBase(Double unSaldo) {
		return precioBase;
	}
	
	/* Metodo solo para testeo */
	public Double precioBase() {
		return precioBase;
	}
}
