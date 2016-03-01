package clientesYPaquetes;

public class PaqueteTipoPrecioXHabitacion implements TipoDePaquete {
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
