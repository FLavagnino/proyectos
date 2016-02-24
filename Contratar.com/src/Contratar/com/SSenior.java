package Contratar.com;

public class SSenior {
	private static SSenior instance;
	private SSenior() {}
	
	public static SSenior getInstance() {
		if (instance == null){
			instance = new SSenior();
		}
		return instance;
	}
	
	public Double sueldoPromedio(Empresa unaEmpresa, Usuario unUsuario) {
		return unUsuario.getAniosExp() * 2000.0;
	}
}
