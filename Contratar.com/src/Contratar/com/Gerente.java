package Contratar.com;

public class Gerente implements Categoria {
	private static Gerente instance;
	private Gerente() {}
	
	public static Gerente getInstance() {
		if (instance == null){
			instance = new Gerente();
		}
		return instance;
	}
	
	public Double sueldoPromedio(Empresa unaEmpresa, Usuario unUsuario) {
		return unaEmpresa.getCantidadEmpleados() / 10 * unUsuario.getSueldoActual();
	}
}
