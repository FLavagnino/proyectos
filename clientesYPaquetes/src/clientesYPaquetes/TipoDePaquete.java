package clientesYPaquetes;
import org.slf4j.LoggerFactory;

public interface TipoDePaquete {
	public final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(TipoDePaquete.class);
	
	public Double precioBase(Double unSaldo);
	/* Metodo solo para testeo */
	public Double precioBase();
}
