package clientesYPaquetes;

import org.slf4j.LoggerFactory;

public class PaqueteTipoPrecioFijo implements TipoDePaquete {
	public final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(PaqueteTipoPrecioFijo.class);
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
