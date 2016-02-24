package claseUno;

public class CalculadorDePrecio {
	static final Double IVA = 21.0;
	
	public Double calcularPrecio(Cliente unCliente, Double precioBase) {
		Double precio;
		precio = unCliente.calcularPrecio(precioBase) * (IVA / 100 + 1);
		return precio;
	}
}