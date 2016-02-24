package claseUno;

public class EmpleadoDespegar implements TipoCliente {

	static private Double IndiceBonificacion = 0.7;
	
	public Double getIndice() {
		return IndiceBonificacion;
	}
	
	public Double calcularPrecio(Double precioBase) {
		return (IndiceBonificacion * precioBase);
	}
}
