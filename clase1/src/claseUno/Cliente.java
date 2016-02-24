package claseUno;

public class Cliente {
	
	private String nombre;
	private TipoCliente estrategia;
	
	public Cliente(String unNombre, TipoCliente unaEstrategia) {
		nombre = unNombre;
		estrategia = unaEstrategia;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Double calcularPrecio(Double precioBase) {
		return estrategia.calcularPrecio(precioBase);
	}
}