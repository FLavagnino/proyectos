package clientesYPaquetes;
import org.slf4j.LoggerFactory;

public class PaqueteTipoPrecioXHabitacion implements TipoDePaquete {
	public final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(PaqueteTipoPrecioXHabitacion.class);
	private Double cantidadHabitaciones;
	private Double precioHabitacion;
	
	public PaqueteTipoPrecioXHabitacion(Double unaCantidadHabitaciones, Double unPrecioHabitacion) {
		cantidadHabitaciones = unaCantidadHabitaciones;
		precioHabitacion = unPrecioHabitacion;
	}
	
	public Double precioBase(Double unSaldo) {
		return cantidadHabitaciones * precioHabitacion;
	}
	
	/* Metodo solo para testeo */
	public Double precioBase() {
		return cantidadHabitaciones * precioHabitacion;
	}
}
