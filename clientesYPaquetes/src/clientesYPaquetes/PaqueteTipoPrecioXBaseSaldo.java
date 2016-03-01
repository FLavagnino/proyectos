package clientesYPaquetes;

public class PaqueteTipoPrecioXBaseSaldo implements TipoDePaquete {
	
	public Double precioBase(Double unSaldo) {
		return unSaldo * 0.1;
	}
	
	/* Metodo solo para testeo */
	public Double precioBase() {
		return 0.0;
	}
}
