package clientesYPaquetes;
import org.slf4j.LoggerFactory;

public class Paquete {
	public final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Paquete.class);
	private Double impuesto;
	private TipoDePaquete tipo;
	
	public Paquete(TipoDePaquete unTipo, Double unImpuesto) {
		tipo = unTipo;
		impuesto = unImpuesto;
	}
	
	public void setTipo(TipoDePaquete unTipo) {
		tipo = unTipo;
	}
	
	public Double precio(Double unSaldo) {
		return tipo.precioBase(unSaldo) * (impuesto + 1);
	}
	
	/* Metodo solo para testeo */
	public Double precio() {
		return tipo.precioBase() * (impuesto + 1);
	}
}
