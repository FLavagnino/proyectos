package clientesYPaquetes;
import org.slf4j.LoggerFactory;

public class PaqueteTipoPrecioXBaseSaldo implements TipoDePaquete {
	public final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(PaqueteTipoPrecioXBaseSaldo.class);
	
	public Double precioBase(Double unSaldo) {
		return unSaldo * 0.1;
	}
	
	/* Metodo solo para testeo */
	public Double precioBase() {
		return 0.0;
	}
}
