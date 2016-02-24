package Contratar.com;

public class Junior {
	private static Junior instance;
	private Junior() {}
	
	public static Junior getInstance() {
		if (instance == null){
			instance = new Junior();
		}
		return instance;
	}
	
	public Double sueldoPromedio(Empresa unaEmpresa, Usuario unUsuario) {
		if (unUsuario.getSueldoActual() > unaEmpresa.getSueldoBase()) {
			return unUsuario.getSueldoActual();
		} else {
			return unaEmpresa.getSueldoBase();
		}
	}
}
